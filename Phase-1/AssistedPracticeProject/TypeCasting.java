package com.simplilearn.typcasting;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String  str= sc.nextLine();
		
        //converting string into primitive datatype(Int)
		int num=Integer.parseInt(str);
		System.out.println("String converted into Integer type "+num);
	}
        
}
