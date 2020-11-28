package com.rnz;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PasswordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * a password must have at least 8 character 
		 * a password must have a number
		 * a password must have a alphabet
		 * a password must have at least one of these: @ # $ ! _   
		 * 
		 * 
		 */
		System.out.println("This program checks to see if you have a good password or not.");
		boolean repeate= true;
		
		while (repeate) {
			
		Scanner myObj = new Scanner(System.in);
		
		
		String userPassword = myObj.nextLine();
		
		System.out.println(userPassword + " is your password right?");
		
		myObj = new Scanner(System.in);
		String verifiy = myObj.nextLine();
		if (verifiy.equalsIgnoreCase("yes")) {
			System.out.println("Ok checking right now!");
			repeate=false;
			
		}
		else {
			System.out.println("Enter password again.");
			
		}
		boolean foundSpecialChar = false;
		
		if ( userPassword.indexOf("@")>-1 ||
		 userPassword.indexOf("#")>-1||
		 userPassword.indexOf("!")>-1||
		 userPassword.indexOf("_")>-1||
		 userPassword.indexOf("$")>-1||
		 userPassword.indexOf("%")>-1||
		 userPassword.indexOf("^")>-1||
		 userPassword.indexOf("&")>-1||
		 userPassword.indexOf("*")>-1)
			foundSpecialChar = true;
		
		else {
			System.out.println("This password must have a special character @,#,!,_,$,%,^,&,*");
		}
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		boolean foundALetter = false;
		for (int i=0;i<userPassword.length();i++ )
		{
		    int ascii=	(int)userPassword.charAt(i);
		    
		    if ((ascii >=65 && ascii<=90) || (ascii>=97 && ascii<=122))
		    {
		    	foundALetter = true;
		    }
		    
		    
		}
		if (!foundALetter) {
		System.out.println("This password needs letters.");
			}
		
		boolean foundANumber= false;
		for (int i=0;i<userPassword.length();i++ )
		{
		    int ascii=	(int)userPassword.charAt(i);
		    
		    if ((ascii >=48 && ascii<=57) )
		    {
		    	foundANumber=true;
		    }
		}
		
		boolean userpasswordlength = false;
		
		
		if (userPassword.length()>=8 ) {
			userpasswordlength = true;
		}
		
		if (!userpasswordlength) {
			System.out.println("This password needs to be 8 digits long.");
		}
		
		
		if (!foundANumber)
		{
			System.out.println("This password needs number.");
		}
		
		if (foundANumber && foundALetter && foundSpecialChar && userpasswordlength) {
			System.out.println("This is a good password!");
		}
		//System.out.println(userPassword.length());
		}
	}

}
