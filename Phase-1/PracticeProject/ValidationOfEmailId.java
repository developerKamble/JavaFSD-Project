package com.phase1.project2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfEmailId {
	
	public static void main(String[] args) {
		
		ArrayList <String> emails =new ArrayList <String>();
		emails.add("komalkamble11@gmail.com");
		emails.add("ritachopda12@gmail.com");
		emails.add("viky.yadav34@gmail.com");
		emails.add("nehasharma@gmail.com");
		emails.add("tanujakamble@gmail.com");
		emails.add("tusharmohan@gmail.com");
		emails.add("mini.sharma@gmail.com");

		System.out.println(emails);
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int count=1;
		
		String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +
	        		"(?:[a-zA-z0-9-]+\\.)+[a-zA-Z]{2,7}$";  
	     //Compile regular expression to get the pattern  
	    Pattern pattern = Pattern.compile(regex); 
	    
		System.out.println("Enter the EmailId");
	
		do {
			String input = sc.next();

			if (pattern.matcher(input).matches()) {
				count=0;

				for (String s: emails) {
					flag = input.equals(s);
					if(flag == true) {
						System.out.println("Emailid Present in list");
					    break;
					}
				} if(flag == false)
					System.out.println("Emailid not present in list");
			}
			else {
				System.out.println("Email ID entered by a user is wrong.....\nPlease Enter correct email id");
				count++;
			}
			
		}while(count>1);
			
		
   }

}
