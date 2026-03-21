public class CreateNewAccount {

    // Fields (essential information for an account)
    private String username;
    private String email;
    private String password;

    // Constructor to initialize a new account
    public CreateNewAccount(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Method to display account details (excluding password for security)
    public void displayAccountInfo() {
        System.out.println("Account Created Successfully!");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }

    // Main method to test creating a new account
    public static void main(String[] args) {
        // Example: create a new account
        CreateNewAccount account = new CreateNewAccount("tharun416", "tharun@example.com", "password123");

        // Display account info
        account.displayAccountInfo();
    }
}