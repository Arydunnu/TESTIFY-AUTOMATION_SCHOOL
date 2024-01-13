package ExceptionInterface;

public class LogInTest {

    // Constants for error messages
    private static final String USERNAME_NULL_ERROR = "Username cannot be null";
    private static final String PASSWORD_NULL_ERROR = "Password cannot be null";
    private static final String INVALID_CREDENTIALS_ERROR = "Invalid username or password";
    private static final String LOGIN_FAILED_ERROR = "Login failed";

    /**
     * Method to test login functionality
     *
     * @param username User's username
     * @param password User's password
     * @return true if login is successful, false otherwise
     * @throws IllegalArgumentException If username or password is null
     * @throws InvalidCredentialsException If the provided credentials are invalid
     * @throws LoginFailedException If login fails for any reason
     */
    public boolean testLogin(String username, String password)
            throws IllegalArgumentException, InvalidCredentialsException, LoginFailedException {
        // Validate username and password
        validateCredentials(username, password);

        // Perform login
        boolean loginSuccessful = performLogin(username, password);

        if (!loginSuccessful) {
            throw new LoginFailedException(LOGIN_FAILED_ERROR);
        }

        return true;
    }

    /**
     * Method to validate username and password
     *
     * @param username User's username
     * @param password User's password
     * @throws IllegalArgumentException If username or password is null
     */
    private void validateCredentials(String username, String password) throws IllegalArgumentException {
        if (username == null) {
            throw new IllegalArgumentException(USERNAME_NULL_ERROR);
        }

        if (password == null) {
            throw new IllegalArgumentException(PASSWORD_NULL_ERROR);
        }
    }

    /**
     * Method to perform the actual login
     *
     * @param username User's username
     * @param password User's password
     * @return true if login is successful, false otherwise
     * @throws InvalidCredentialsException If the provided credentials are invalid
     */
    private boolean performLogin(String username, String password) throws InvalidCredentialsException {
        // Perform authentication logic, check if username and password match
        // Throw InvalidCredentialsException if credentials are invalid
        // Return true if login is successful
        // Otherwise, return false
        return false; // Placeholder for the example
    }

    // Custom exception for invalid credentials
    public static class InvalidCredentialsException extends Exception {
        public InvalidCredentialsException(String message) {
            super(message);
        }
    }

    // Custom exception for login failure
    public static class LoginFailedException extends Exception {
        public LoginFailedException(String message) {
            super(message);
        }
    }

    // Example usage
    public static void main(String[] args) {
        LogInTest loginTest = new LogInTest();

        try {
            loginTest.testLogin("validUsername", "validPassword");
        } catch (IllegalArgumentException | InvalidCredentialsException | LoginFailedException e) {
            e.printStackTrace();
        }
    }
}
