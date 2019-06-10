package com.revature.pojo;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;
	import java.util.HashMap;
	import java.util.Map;


	public class User {

			String firstName;
			String lastName;
			String userName;
			String password;
			String userType;
			
			
			
		public User (String firstName, String lastName, String userName, String password, String userType) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.userName = userName;
			this.password = password;
			this.userType = userType;
		}

		
		/*public static void login(String userName, String password) throws Exception {
			  File file2 = new File("users.bin");
			  FileInputStream fis2 = new FileInputStream(file2);
			  ObjectInputStream ois2 = new ObjectInputStream(fis2);
			  Map<String, User>uMap2 =  (Map<String, User>) ois2.readObject();
			  System.out.println("username: " + userName);
			  System.out.println("password" + password);
			  
			  System.out.println(uMap2.containsKey(userName));
			  System.out.println(uMap2.get(userName).password );
			  if (uMap2.containsKey(userName) && uMap2.get(userName).password.equals(password)){
				  
				  System.out.println("Successful login!");
			  }
			  
			
		}
		*/
		
		 public static void register(User u) throws Exception { 
			  Map<String, User> uMap = new HashMap<String, User>(); 
			  File f = new File("users.bin"); 
			  try {
			    
			 FileInputStream fis = new FileInputStream(f); 
			 ObjectInputStream ois = new ObjectInputStream(fis); 
			     uMap =  (Map<String, User>) ois.readObject();

			  for(User user : uMap.values()) { 
			  System.out.println("Map values 1st "+ user.userName);
			  }
			  }catch(IOException e) {
			  
			  }
			  

			  uMap.put(u.userName, u); 
			  

			  FileOutputStream fos = new FileOutputStream(f);
			  ObjectOutputStream oos = new ObjectOutputStream(fos);
			  oos.writeObject(uMap);
			  oos.close();
			  
			 
			  System.out.println("Successful registration!");
			  System.out.println("uMap2.size() " + uMap.size());
			  
			  for(User user : uMap.values()) {
			  System.out.println("Map values 2nd "+ user.userName);
			  }
			 
		 }

		public static void register(Employee newEmployee) throws Exception { 
			  Map<String, Employee> uMap = new HashMap<String, Employee>(); 
			  File f = new File("employees.bin"); 
			  try {
			    
			 FileInputStream fis = new FileInputStream(f);
			 ObjectInputStream ois = new ObjectInputStream(fis); 
			     uMap =  (Map<String, Employee>) ois.readObject(); 

			  for(Employee employee : uMap.values()) { 
			  System.out.println("Map values 1st "+ Employee.userName);
			  }
			  }catch(IOException e) {
			  
			 
			  }
			  

			  uMap.put(newEmployee.userName, newEmployee); 
			// TODO Auto-generated method stub
			  FileOutputStream fos = new FileOutputStream(f);
			  ObjectOutputStream oos = new ObjectOutputStream(fos);
			  oos.writeObject(uMap);
			  oos.close();
			  
			  FileInputStream fis2 = new FileInputStream(f);
			  ObjectInputStream ois2 = new ObjectInputStream(fis2);
			  Map<String, Employee>uMap2 =  (Map<String, Employee>) ois2.readObject();
			  System.out.println("Successful registration!");
			  System.out.println("uMap2.size() " + uMap2.size());
			  
			  for(Employee employee : uMap2.values()) {
			  System.out.println("Map values 2nd "+ employee.userName);
			  }
			
		}

		public static void register(Customer newCustomer) throws Exception { 
			  Map<String, Customer> uMap = new HashMap<String, Customer>(); 
			  File f = new File("customer.bin");
			  try {
			    
			 FileInputStream fis = new FileInputStream(f); 
			 ObjectInputStream ois = new ObjectInputStream(fis); 
			     uMap =  (Map<String, Customer>) ois.readObject(); 

			  for(Customer customer : uMap.values()) { 
			  System.out.println("Map values 1st "+ customer.userName);
			  }
			  }catch(IOException e) {
			  System.out.println("An Error occurred");
			  System.out.println(e.getMessage());
			  }
			  

			  uMap.put(newCustomer.userName, newCustomer); 
			// TODO Auto-generated method stub
			
			  
			  FileOutputStream fos = new FileOutputStream(f);
			  ObjectOutputStream oos = new ObjectOutputStream(fos);
			  oos.writeObject(uMap);
			  oos.close();
			  
			  FileInputStream fis2 = new FileInputStream(f);
			  ObjectInputStream ois2 = new ObjectInputStream(fis2);
			  Map<String, Customer>uMap2 =  (Map<String, Customer>) ois2.readObject();
			  System.out.println("Successful registration!");
			  System.out.println("uMap2.size() " + uMap2.size());
			  
			  for(Customer customer : uMap2.values()) {
			  System.out.println("Map values 2nd "+ customer.userName);
		}

	}
	}

