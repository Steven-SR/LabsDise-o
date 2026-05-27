/**
 * Simulates a database/external system that loads user profiles
 * Takes 3 seconds to load each user (simulating network/DB latency)
 */
public class UserRepository {
    
    /**
     * Simulates loading user profile from database
     * Takes 3 seconds to complete
     */
    public UserProfile loadUserProfile(String userId) {
        // Simulate slow database/external system call
        try {
            Thread.sleep(3000); // 3 second delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        // Return user profile based on userId
        return createUserProfile(userId);
    }
    
    /**
     * Helper method to create different user profiles
     */
    private UserProfile createUserProfile(String userId) {
        switch (userId) {
            case "user_001":
                return new UserProfile(userId, "Juan García", "admin", "dark_mode");
            case "user_002":
                return new UserProfile(userId, "María López", "editor", "light_mode");
            case "user_003":
                return new UserProfile(userId, "Carlos Ruiz", "viewer", "high_contrast");
            default:
                return new UserProfile(userId, "Usuario Desconocido", "guest", "default");
        }
    }
}
