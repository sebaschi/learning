package oopPart1;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	
	// getters
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public int getAge() {
		return this.age;
	}
	
	//setters
	public void setFirstName(String s) {
		this.firstName = s;
	}
	public void setLastName(String s) {
		this.lastName = s;
	}
	public void setAge(int a) {
		if(a<0 || a>100) {
			this.age = 0;
		} else {
			this.age = a;
		}
	}
	
	// methods
	public boolean isTeen() {
		if(this.age > 12 && this.age < 20) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getFullName() {
		if(this.firstName.isEmpty()&&this.lastName.isEmpty()) {
			return "";
		} else if(this.firstName.isEmpty()) {
			return this.lastName;
		} else if(this.lastName.isEmpty()) {
			return this.firstName;
		} else {
			return this.firstName + " " + this.lastName;
		}
	}

}
