package com.revature.ui;


import java.util.Scanner;

import com.revature.pojo.Customer;
import com.revature.pojo.Employee;
import com.revature.pojo.User;

public class Input{
	
	private static final Scanner SCAN = new Scanner(System.in);
	
	public static String getAnswer() {
		
		String answer = SCAN.nextLine();
		
		if (answer.equalsIgnoreCase("Y")) {
			return answer;
			}
		if (answer.equalsIgnoreCase("N")) {
		return answer;
		}
		return answer;
		}
	public static void getRegisterInfo() throws Exception {
		
		System.out.println("First name:");
		String firstName = SCAN.nextLine();
		
		System.out.println("Last name:");
		String lastName = SCAN.nextLine();
		
		System.out.println("Username: ");
		String userName= SCAN.nextLine();
		
		System.out.println("Password:");
		String password = SCAN.nextLine();
		
		System.out.println("Employee[1] or Customer[2]?");
		String userType = SCAN.nextLine();
	
		
		if (userType.equals("1")) {
			Employee newEmployee = new Employee(firstName, lastName, userName, password, "Employee");
			User.register(newEmployee);
		}
		if (userType.equals("2")) {
			Customer newCustomer = new Customer(firstName, lastName, userName, password,"Customer");
			User.register(newCustomer);
		}
			
		}
	public static void getLoginInfo() {
		
		System.out.println("Username: ");
		String loguserName= SCAN.nextLine();
		
		System.out.println("Password");
		String logpassword = SCAN.nextLine();
		
		System.out.println("WELCOME EMPLOYEE " +loguserName);
		System.out.println("What would you like to do?");
		
		
		/*
		 * try {
		 * User.login(loguserName, logpassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 */
			
		
		
	}
		
	
	}


