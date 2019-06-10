package com.revature.pojo;

import java.util.List;

public class CarDealership {
		
		private List<Employee> employees;
		
		private List<Customer> customers;
		
		private List<User> users;
		
		private CarSystem carsystem;
		
		private List<Car> cars;
		
		public CarSystem getSystem() {
			return carsystem;
		}
		
		public List<Car> getCars() {
			return cars;
		}
		
		public List<Customer> getCustomers() {
			return customers;
		}
		
		public List<User> getUsers() {
			return users;
		}

		public List<Employee> getEmployees() {
			return employees;
		}

		
	}


