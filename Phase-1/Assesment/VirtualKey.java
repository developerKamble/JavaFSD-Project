package com.simplilearn.finalproject_phase1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class VirtualKey {
	String appName;
	String devName;
	int devId;
	
	public static File foldername=new File("C:\\Users\\Komal Kamble\\OneDrive\\Desktop\\Files");
	VirtualKey(String appName,String devName,int devId){
		
		this.appName=appName;
		this.devName=devName;
		this.devId=devId;
		
	}
	void display() {
		System.out.println("\nApplication name  : "+appName);
		System.out.println("  Devloper name  : "+devName);
		System.out.println("   Devloper Id  : "+devId);

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		VirtualKey v1=new VirtualKey("LockedMe.com","Komal Kamble",245678);
		System.out.println();
		v1.display();
		System.out.println();
		Scanner sc=new Scanner(System.in);
		int ch;
		FileOperations f1=new FileOperations();
		
		do {
		System.out.println("########### Main Menu ###########\n\n1.  Display List of File In directory\n2.  To perform operations on files\n3.  Exit application");
		ch=sc.nextInt();
		
		switch(ch) {
			
		case 1:
			showFiles();
				break;
		case 2:
				try {
					f1.fileoperations();
				}catch(Exception e) {
					System.out.println("error "+e);
				}
				break;
		case 3:System.out.println("Closing the Application........... ");
		        break;
		default:System.out.println("Enter correct choice :-");
		
		
		}
		}while(ch!=3);
				
		System.out.println("Application closed!!!");


	}
	
	 public static void showFiles() {
        if (foldername.list().length==0)
            System.out.println("The folder is empty");
        else {
            String[] list = foldername.list();
            System.out.println("The files in "+ foldername +" are :");
          //  Arrays.sort(list);
            for (String str:list) {
                System.out.println(str);
            }
        }
        System.out.println();
    }

}
