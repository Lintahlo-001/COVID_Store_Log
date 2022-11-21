/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package storevisitorlog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Miku
 */
public class Main {
    
    public static void main(String[] args) throws IOException, ParseException {
        // TODO Auto-generated method stub
        //System.out.println(NameGenerator.randomUserID());
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        
        String firstName, middleName, lastName, birthDate, phoneNumber, passCheck, password = "123admin";
        char choice = ' ', option = ' ';
        boolean programLoop = true, admin = false, search = true;
        
        LinkedList<UserProfile> users = new LinkedList<>();
        
        
        
        do{UserProfile customer = new UserProfile();
        System.out.println("==========================");
        System.out.println("Welcome! Please Choose");
        System.out.println("1. Customer");
        System.out.println("2. Admin");
        System.out.println("3. Quit");
        System.out.print("Enter A Number: ");
        try {
            choice = reader.readLine().charAt(0);
        } catch (IOException ex) {
            System.out.println("Please Only Enter A Number");
        }
        
        switch (choice) {
            
            case '1':
                System.out.println("=============================");
                System.out.println("Please complete the following");
                System.out.print("First Name: ");
                firstName = reader.readLine();
                System.out.print("Middle Name: ");
                middleName = reader.readLine();
                System.out.print("Last Name: ");
                lastName = reader.readLine();
                System.out.print("Enter your Birth Date(mm/dd/yyyy): ");
                birthDate = reader.readLine();
                System.out.print("Enter you Phone Number: ");
                phoneNumber = reader.readLine();
        
                customer.setFullName(firstName, middleName, lastName);
                customer.setBDay(birthDate);
                customer.setPhoneNumber(phoneNumber);
        
                users.add(customer);
                break;
                
            case '2':
                do{
                System.out.println("===================");
                //password = 123admin
                System.out.print("Enter your password: ");
                passCheck = reader.readLine();
                
                if (passCheck.equals(password)) {
                    System.out.println("Login Success!");
                    admin = true;
                } else {
                    System.out.println("===================");
                    System.out.println("Incorrect Password");
                    System.out.println("Please Try Again");
                    admin = false;
                }
                }while (admin == false);
                
                do{
                System.out.println("======================");
                System.out.println("Please Select");
                System.out.println("1. Search users with Date and Time");
                System.out.println("2. Search users with First Name");
                System.out.println("3. Search users with Last Name");
                System.out.println("4. Search users with Phone Number");
                System.out.println("5. Log Out");
                System.out.print("Enter A Number: ");
                try {
                    option = reader.readLine().charAt(0);
                } catch (IOException ex) {
                    System.out.println("Please Only Enter A Number");
                }
                
                switch (option) {
                    
                    case '1':
                        String date;
                        System.out.println("=================================================================");
                        System.out.print("Enter Date and Time strickly in this format(MM/dd/yyyy/hh/mm/ss): ");
                        date = reader.readLine();
                        Date convert = new SimpleDateFormat("MM/dd/yyyy/hh/mm/ss").parse(date);
                        
                        int i = 0;
                        for(UserProfile temp:users){
                            if (convert.equals(temp.getDateAndTime())&& i < 10) {
                                System.out.println("=================");
                                System.out.println("User: " + (i+1));
                                System.out.println("User ID: " + temp.getUserID());
                                System.out.println("Phone Number: " + temp.getPhoneNumber());
                                System.out.println("Date and Time entered: " + temp.getDateAndTime());
                                i++;
                            } else {
                            }
                        }
                        System.out.println("None or no more results found");
                        break;
                        
                    case '2':
                        String firstNameChecker;
                        System.out.println("=================");
                        System.out.print("Enter First Name: ");
                        firstNameChecker = reader.readLine();
                         
                        int j = 0;
                        for(UserProfile temp:users){
                            if (firstNameChecker.equals(temp.getFName()) && j < 10) {
                                System.out.println("=================");
                                System.out.println("User: " + (j+1));
                                System.out.println("User ID: " + temp.getUserID());
                                System.out.println("Phone Number: " + temp.getPhoneNumber());
                                System.out.println("Date and Time entered: " + temp.getDateAndTime());
                                j++;
                            }
                        }
                        System.out.println("None or no more results found");
                        break;
                        
                    case '3':
                        String lastNameChecker;
                        System.out.println("=================");
                        System.out.print("Enter Last Name: ");
                        lastNameChecker = reader.readLine();
                         
                        int k = 0;
                        for(UserProfile temp:users){
                            if (lastNameChecker.equals(temp.getLName()) && k < 10) {
                                System.out.println("=================");
                                System.out.println("User: " + (k+1));
                                System.out.println("User ID: " + temp.getUserID());
                                System.out.println("Phone Number: " + temp.getPhoneNumber());
                                System.out.println("Date and Time entered: " + temp.getDateAndTime());
                                k++;
                            }
                        }
                        System.out.println("None or no more results found");
                        break;
                        
                    case '4':
                        String phoneNumberChecker;
                        System.out.println("=================");
                        System.out.print("Enter Phone Number: ");
                        phoneNumberChecker = reader.readLine();
                         
                        int l = 0;
                        for(UserProfile temp:users){
                            if (phoneNumberChecker.equals(temp.getPhoneNumber()) && l < 10) {
                                System.out.println("=================");
                                System.out.println("User: " + (l+1));
                                System.out.println("User ID: " + temp.getUserID());
                                System.out.println("Phone Number: " + temp.getPhoneNumber());
                                System.out.println("Date and Time entered: " + temp.getDateAndTime());
                                l++;
                            }
                        }
                        System.out.println("None or no more results found");
                        break;
                        
                    case '5':
                        System.exit(0);
                        search = false;
                        break;
                        
                    default:
                        System.out.println("===================");
                        System.out.println("Incorrect Input");
                        System.out.println("Only Enter 1 - 5");  
                        break;
                }
                }while (search == true);
                programLoop = false;
                break;

            case '3':
                System.exit(0);
                programLoop = false;
                break;
                
            default:
                System.out.println("===================");
                System.out.println("Incorrect Input");
                System.out.println("Only Enter 1 - 3");  
                break;
        }           
        }while (programLoop == true);
    }
}
