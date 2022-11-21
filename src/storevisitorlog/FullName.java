/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storevisitorlog;

/**
 *
 * @author Miku
 */
public class FullName {
    
	private String firstName;
	private String middleName;
	private String lastName;
	
	public FullName() {
		this.firstName = "Dummy First Name";
		this.middleName = "DummyMiddleName";
		this.lastName = "Dummy LastName";
	}
	
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
	
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	//TODO create a method that will return the Middle Initial
        public char getMiddleInitial() {
            return this.middleName.charAt(0);
        }
}
