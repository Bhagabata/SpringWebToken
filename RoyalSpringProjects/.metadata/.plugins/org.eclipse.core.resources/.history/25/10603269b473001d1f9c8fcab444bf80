package uservalidate;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class User {
	
	@NotBlank(message = "*First name cannot be null and must have size greater than 0")
	private String firstName;
	
	@NotBlank(message = "*Second name must not be null, empty value/space can be considered")
	private String lastName;
	
	@NotBlank(message = "*Username must not be null and must contain 1 or more characters")
	private String userName;
	
	@Min(value = 18, message = "Age must be greater than 18")
	@Max(value = 25, message = "Age must be smaller than 25")
	private int age;
	
	@Size(min = 10, max = 200, message = "About Me must be between 10 and 200 characters")
	private String aboutme;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Email should be valid")
	private String email;
	
	@Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", message = "Password is not valid")
	private String password;
	
	@AssertTrue(message = "Please select the valid option")
	private boolean Working;
	
	@AssertTrue(message = "Please select the valid option")
	private boolean Student;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAboutme() {
		return aboutme;
	}
	public void setAboutme(String aboutme) {
		this.aboutme = aboutme;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isWorking() {
		return Working;
	}
	public void setWorking(boolean working) {
		Working = working;
	}
	public boolean isStudent() {
		return Student;
	}
	public void setStudent(boolean student) {
		Student = student;
	}

	
}
