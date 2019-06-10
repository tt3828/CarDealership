package com.revature.driver;

import com.revature.pojo.CarDealership;
import com.revature.pojo.Employee;
import com.revature.ui.EmployeeOptions;
import com.revature.ui.Input;
import com.revature.ui.LoginScreen;
import com.revature.ui.RegisterScreen;
import com.revature.ui.Screen;
import com.revature.ui.WelcomeScreen;

public class Driver {

	private static Screen welcome = new WelcomeScreen();
	private static Screen register = new RegisterScreen();
	private static Screen login = new LoginScreen();
	private static Screen employee = new EmployeeOptions();
	
	public static void main(String[] args) throws Exception {
		welcome.display();
		String response = Input.getAnswer();
		if (response.contentEquals("Y")) {
		login.display();
		Input.getLoginInfo();
		}
		else {
			register.display();
			Input.getRegisterInfo();
			
		}
		
	}
}