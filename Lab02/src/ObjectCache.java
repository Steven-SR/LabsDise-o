import java.util.HashMap;
import java.util.Map;

/**
 * Object Cache - Stores user profiles to avoid repeated database queries
 */
public class ObjectCache {
    private static ObjectCache instance;
    private final Map<String, UserProfile> cache;
    private int hits;
    private int misses;

    private ObjectCache() {
        this.cache = new HashMap<>();
        this.hits = 0;
        this.misses = 0;
    }

    /**
     * Get singleton instance
     */
    public static synchronized ObjectCache getInstance() {
        if (instance == null) {
            instance = new ObjectCache();
        }
        return instance;
    }

    /**
     * Get user from cache or return null if not found
     */
    public UserProfile get(String userId) {
        if (cache.containsKey(userId)) {
            hits++;
            return cache.get(userId);
        } else {
            misses++;
            return null;
        }
    }

    /**
     * Store user in cache
     */
    public void put(String userId, UserProfile profile) {
        cache.put(userId, profile);
    }

    /**
     * Print cache statistics
     */
    public void printStats() {
        System.out.println("\n========== CACHE STATISTICS ==========");
        System.out.println("Hits: " + hits);
        System.out.println("Misses: " + misses);
        System.out.println("Cached users: " + cache.size());
        if (hits + misses > 0) {
            double hitRate = (hits * 100.0) / (hits + misses);
            System.out.println("Hit Rate: " + String.format("%.1f%%", hitRate));
        }
        System.out.println("=====================================\n");
    }
}
