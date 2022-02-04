package com.phase1.project;

import java.util.Scanner;

public class ArithmaticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a,b;
		 float res=0;
	        char ch,x;
	        Scanner sc =new Scanner(System.in);
			System.out.println("Enter the num1");
	        a=sc.nextInt();
			System.out.println("Enter the num2");
	        b=sc.nextInt();
	        
	        do {
				System.out.println("Enter the operation u want to do \n 1 + \n 2 - \n 3 /\n 4 * \n ");
		        ch=sc.next().charAt(0);
	     
		        switch(ch) {
	
		            case '1': {
		                res=a+b;
		                System.out.println("\nResult : "+res);
		                break;
		            }
		            case '2': {
		                res=a-b;
		                System.out.println("\nResult : "+res);
		                break;
		            }
		            case '3': {
		                res=(float)a/b;
		                System.out.println("\nResult : "+res);
		                break;
		            }
		            case '4': {
		                res=a*b;
		                System.out.println("\nResult : "+res);
		                break;
		            }
		            default :
		            	 System.out.println("Enter Valid Option");

		        }
		        System.out.println("Do u want to continue (y/n) : ");
                x=sc.next().charAt(0);
	        }while(x=='y');
	}
}
