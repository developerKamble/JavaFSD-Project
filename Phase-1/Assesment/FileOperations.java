package com.simplilearn.finalproject_phase1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FileOperations {
	
	public static File foldername=new File("C:\\Users\\Komal Kamble\\OneDrive\\Desktop\\Files");

	public static String getName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name :");
		String name= sc.next();
		return name;
	}
	
	
		Scanner sc=new Scanner(System.in);

		
		 void addFile(String filename) throws IOException {
		        File filepath = new File(foldername +"/"+filename);
		        String[] list = foldername.list();
		        for (String file: list) {
		            if (filename.equalsIgnoreCase(file)) {
		                System.out.println("File " + filename + " already exists at " + foldername);
		                return;
		            }
		        }
		        filepath.createNewFile();
		        System.out.println("File "+filename+" added to the dirctory");
		    }

		    void deleteFile(String filename) {
		        File filepath = new File(foldername +"/"+filename);
		        String[] list = foldername.list();
		        for (String file: list) {
		            if (filename.equals(file) && filepath.delete()) {
		                System.out.println("File " + filename + " deleted from the dirctory ");
		                return;
		            }
		        }
		        System.out.println("Delete Operation failed. FILE NOT FOUND");
		    }

		    void searchFile(String filename) {
		        String[] list = foldername.list();
		        for (String file: list) {
		            if (filename.equals(file)) {
		                System.out.println("FOUND : File " + filename + " exists at dirctory");
		                return;
		            }
		        }
		        System.out.println("File NOT found (FNF)");
		    }
		
	
	public void fileoperations()throws IOException  {
		
		Scanner sc=new Scanner(System.in);
		
		char ch;
		int x;
		do {
		System.out.println("Enter the option u want to perform :");

			System.out.println("1.Create File \n2.Search File\n3.Delete File\n4.Close app");
			ch=sc.next().charAt(0);
			switch(ch) {
				case '1': {
					System.out.print("↳ Adding a file...Please Enter a File Name : ");
                    String filename = sc.next().trim().toLowerCase();
                    addFile(filename); 
				          break;
				}
				case '2':{
					System.out.print("↳ Searching a file...Please Enter a File Name : ");
                    String filename = sc.next().trim();
                    searchFile(filename);
							break;
		         }
				case '3': {
					System.out.print("↳ Deleting a file...Please Enter a File Name : ");
                    String filename = sc.next().trim();
                    deleteFile(filename);
							break;     
				}
				case '4':  System.out.println("Going Back to MAIN MENU");
					break;
			
				default :System.out.println("Enter correct option ");
				}
		}while(ch!='4');
			
	}
}


