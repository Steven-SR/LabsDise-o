/**
 * Represents a user profile loaded from database/external system
 */
public class UserProfile {
    private final String userId;
    private final String name;
    private final String role;
    private final String preferences;

    public UserProfile(String userId, String name, String role, String preferences) {
        this.userId = userId;
        this.name = name;
        this.role = role;
        this.preferences = preferences;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getPreferences() {
        return preferences;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", preferences='" + preferences + '\'' +
                '}';
    }
}
