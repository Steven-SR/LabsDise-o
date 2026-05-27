/**
 * Simula una aplicación web con múltiples usuarios
 * Demostra el patrón Object Cache para evitar consultas repetidas a BD
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("===== OBJECT CACHE PATTERN =====\n");
        
        ObjectCache cache = ObjectCache.getInstance();
        UserRepository repository = new UserRepository();
        String[] users = {"user_001", "user_002", "user_003"};
        
        // ROUND 1: First load (no cache)
        System.out.println("ROUND 1: First load (Database)");
        for (String user : users) {
            long start = System.currentTimeMillis();
            getOrLoadUser(user, repository, cache);
            long time = System.currentTimeMillis() - start;
            System.out.println("  " + user + " -> " + time + "ms");
        }
        
        // ROUND 2: From cache
        System.out.println("\nROUND 2: Second load (Cache)");
        for (String user : users) {
            long start = System.currentTimeMillis();
            getOrLoadUser(user, repository, cache);
            long time = System.currentTimeMillis() - start;
            System.out.println("  " + user + " -> " + time + "ms");
        }
        
        System.out.println("\n===== RESULTS =====");
        cache.printStats();
    }
    
    /**
     * Gets user from cache if available, otherwise loads from repository
     */
    private static UserProfile getOrLoadUser(String userId, UserRepository repository, ObjectCache cache) {
        UserProfile profile = cache.get(userId);
        
        if (profile == null) {
            profile = repository.loadUserProfile(userId);
            cache.put(userId, profile);
        }
        
        return profile;
    }
}
