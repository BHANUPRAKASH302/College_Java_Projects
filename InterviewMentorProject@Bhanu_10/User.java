public class User {
    String name;
    String password;
    PerformanceTracker tracker;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.tracker = new PerformanceTracker();
    }

    public boolean verifyPassword(String pwd) {
        return this.password.equals(pwd);
    }
}