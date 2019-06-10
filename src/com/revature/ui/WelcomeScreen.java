package com.revature.ui;


public class WelcomeScreen implements Screen {

	public static final String WELCOME_MESSAGE = 
			"Welcome to Tevin's Car Dealership \n Do you have an account with us? Enter [Y or y] for yes. Enter [N or n] for no.";
	
	@Override
	public void display() {
		System.out.println(WELCOME_MESSAGE);
	}
}
