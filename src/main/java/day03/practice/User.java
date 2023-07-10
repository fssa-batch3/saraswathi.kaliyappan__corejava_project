package day03.practice;

public class User {
	
	private String name;
    private String password;
    private String emailId;
    
    
    public User(){
    	//Default constructor
    }
    
    public User(String name, String password, String emailId) {
    	this.name = name;
    	this.password = password;
    	this.emailId = emailId;
    }
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	


     public class TestAccount2 {
    		public void main(String[] args) {
    			User user1 = new User(); 
    			user1.setName("Saraswathi");
    			user1.setPassword("Happy@123");
    			user1.setEmailId("Saraswathi@gmail.com");

    			System.out.println(user1.getName() + "-" + user1.getPassword() + "-"
    					+ user1.getEmailId());
    			
    			// Create Account with Overloaded constructor accepting parameters
    			User user2 = new User("saras", "saras123", "saras@gmail.com");
    			System.out.println(user2.getName() + "-" + user2.getPassword() + "-"
    					+ user2.getEmailId());

    		}
    	}
}