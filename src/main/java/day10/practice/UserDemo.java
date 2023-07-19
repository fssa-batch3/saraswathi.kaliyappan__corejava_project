package day10.practice;

import java.util.ArrayList;

class UserDemo {
    int id;
    String name;
    String emailId;

    public UserDemo(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }

}

class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

class UserManager {
    private ArrayList<UserDemo> userList;

    public UserManager() {
        userList = new ArrayList<>();
    }

    public void register(UserDemo user) throws UserAlreadyExistsException {
        for (UserDemo existingUser : userList) {
            if (existingUser.emailId.equals(user.emailId)) {
                throw new UserAlreadyExistsException("User with email ID '" + user.emailId + "' already exists.");
            }
        }

        userList.add(user);
        System.out.println("User registered successfully: " + user.name);
    }
}

class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        try {
            UserDemo user1 = new UserDemo(1, "John Doe", "john.doe@example.com");
            userManager.register(user1);

            UserDemo user2 = new UserDemo(2, "Jane Smith", "jane.smith@example.com");
            userManager.register(user2);

            UserDemo user3 = new UserDemo(3, "Mike Johnson", "john.doe@example.com");
            userManager.register(user3); 
        } catch (UserAlreadyExistsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
