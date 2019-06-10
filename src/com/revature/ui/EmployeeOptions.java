package com.revature.ui;

import java.util.Scanner;

import com.revature.pojo.Car;

public class EmployeeOptions implements Screen{
		
	
		public static int option;
		public static Scanner answer;
	@Override
	public void display() {
			
			answer = new Scanner(System.in);
			
		do {	
			
			System.out.println("Please enter the following choices\n[1]View Cars\n[2]Add Car\n[3]Remove Car\n[4]Status of Offer");

			option = answer.nextInt();
			
			switch (option) {
			
			case 1 :
				viewcars();
				break;
		case 2: 
				addCar();
				break;
		case 3:
			removeFromList();
				break;
		case 4: 
			System.out.println("offer");
			 	break;
		default: 
			System.out.println("Invalid choices");
			}
		
	}
	
		while(option !=1 && option!=2 && option !=3 && option !=4);
		
	}
			

		
		private void removeFromList() {
			/*
			 * System.out.println("Remove car");
			 
			answer = new Scanner(System.in);
			int i = answer.nextInt();
			Car.carlist.remove(i);
		
			display();
			*/
	}

		private void viewcars() {
			System.out.println(Car.carlist);
			display();
	}


		private void addCar() {
			System.out.println("Enter Make, Model, Year & Price");
			answer = new Scanner(System.in);
			String make = answer.nextLine();
			String model = answer.nextLine();
			int year = answer.nextInt();
			double price = answer.nextDouble();
			
			Car = new Car(make,model,year,price);
			
			Car.addNewCar(car);
			display();

	}


			
		
	}

}
}
