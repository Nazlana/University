package university;

public class Employee {
	String fullName, mail;
	String phoneNumber;
	
	public Employee() {} //default constructor 
	public Employee(String fullName, String mail, String phoneNumber ) {
	 this.fullName= fullName;
	 this.mail=mail; 
	 this.phoneNumber=phoneNumber;
	}
	
	public void  logIn() {
		System.out.println(fullName + " Login");  
		}
	public void logOff() {
		System.out.println("Log off");
	}
	public void food() {}
	
	public String getFullName() {
		return this.fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName=fullName;
		
	}
	public String getMail() {
		return this.mail;
	}
	
	public void setMail(String mail) {
		this.mail=mail;
		
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
		
	}
}

