package com.revature.pojo;

public class Car {

	String make;
	String model;
	int year;
	double price;
	
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public boolean addNewCar(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		return true;
	}
	public String getmake() {
		return make;
	}
	public String getmodel() {
		return model;
	}
	
	public int getyear() {
		return year;
	}
	public double getprice() {
		return price;
	}
}
