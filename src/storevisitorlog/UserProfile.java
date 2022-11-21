/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storevisitorlog;

import java.util.Date;

/**
 *
 * @author Miku
 */
public class UserProfile extends FullName{
	private final String userID;
	private FullName userFullName;
	private String userBirthDate;
	private Date userEnterDateTime;
	private String userPhoneNumber;
        
	//default constructor
	public UserProfile() {
		//TODO use the static method NameGenerator.randomUserID
		//to initialize a random userID on the newly created user
                this.userID = NameGenerator.randomUserID();
		this.userFullName = new FullName();
		this.userBirthDate = "";
		this.userEnterDateTime = new Date();
                this.userPhoneNumber = "";
        }
	
	//TODO create accessors and mutators for the following conditions
	//1. userID can not be modified by any class, but can be accessed
	//2. userFullName can be modified and accessed by any class, however
	//	you need to create:
	//		a. four (4) getters for the full name, only first name, only middle name, and only last name.
	//		b. two (2) setters for the full name using the FullName Class and using the strings
	//			first name, middle name, and last name
	//3. userBirthDate can be modified and accessed by any class
	//4. userCreateDate can be only accessed
        
        public String getUserID() {
            return this.userID;
        }
        
        public String getFullName() {
            String temp = this.userFullName.getLastName() + ", " + this.userFullName.getFirstName() + " " + this.userFullName.getMiddleName();
            return temp;
        }
        public String getFName () {
            return this.userFullName.getFirstName();
        }
        public String getMName () {
            return this.userFullName.getMiddleName();
        }
        public String getLName () {
            return this.userFullName.getLastName();
        }
        public void setFullName(String fName, String mName, String lName) {
            this.userFullName.setFirstName(fName);
            this.userFullName.setMiddleName(mName);
            this.userFullName.setLastName(lName);
        }
        
        public String getBDay() {
            return this.userBirthDate;
        }
        public void setBDay(String bDay) {
            this.userBirthDate = bDay;
        }
        
        public String getPhoneNumber() {
            return this.userPhoneNumber;
        }
        public void setPhoneNumber(String number) {
            this.userPhoneNumber = number;
        }
        
        public Date getDateAndTime() {
            return this.userEnterDateTime;
        }
}

