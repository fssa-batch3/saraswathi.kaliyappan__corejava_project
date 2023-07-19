package day10.practice;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class EmailValidator {
    public static boolean isValidEmail(String emailId) throws InvalidEmailException {
        // Regular expression pattern for basic email validation
        String emailPattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

        if (emailId.matches(emailPattern)) {
            return true;
        } else {
            throw new InvalidEmailException("Invalid email address: " + emailId);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String validEmail = "john.doe@example.com";
        String invalidEmail = "invalid_email";

        try {
            // Test valid email
            if (EmailValidator.isValidEmail(validEmail)) {
                System.out.println("Valid email address: " + validEmail);
            }

            // Test invalid email
            if (EmailValidator.isValidEmail(invalidEmail)) {
                System.out.println("Valid email address: " + invalidEmail);
            }
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}
