package com.phase1.project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

		public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		int ch;
		
		do {
			System.out.println("Enter the option u want to perform :  \n1.Create file \n2.Read file\n3.Append File\n4.Exit");
		    ch=sc.nextInt();
	           
			switch(ch) {
			
			case 1:{
				System.out.println("Enter File Name : ");
				String fileName=sc.next();
				File file=new File("C:\\Users\\Komal Kamble\\OneDrive\\Desktop\\Files\\"+fileName);
				
				if(file.createNewFile()) {
					System.out.println("File is created then data written");
				}else {
					System.out.println("Data overWritten in file");
	
				}
				
				FileWriter writer=new FileWriter(file);

				String data="Welcome................\ndata written while creating.......";
				writer.write(data);
				writer.close();
				System.out.println("\n--------------------------------------------------------");
				System.out.println();
				break;
			}
			case 2:{
				System.out.println("Enter File Name : ");
				String fileName=sc.next();
				try (FileReader reader = new FileReader("C:\\Users\\Komal Kamble\\OneDrive\\Desktop\\Files\\"+fileName)) {
					int data;
					while((data=reader.read())!=-1) {
						System.out.print((char)data);
					}
				}
				System.out.println("\n--------------------------------------------------------");
				System.out.println();
				break;
			}
			case 3:{
				System.out.println("Enter File Name : ");
			    String fileName=sc.next();
			    File filetoappend=new File("C:\\Users\\Komal Kamble\\OneDrive\\Desktop\\Files\\"+fileName);
				
				String fileData="";
				BufferedReader reader=null;
				FileWriter writer=null;

			    try  {
			    	reader=new BufferedReader(new FileReader(filetoappend));
					String line=reader.readLine();
					while(line!=null)
					{
						fileData=fileData+line+System.lineSeparator();
						line=reader.readLine();
					}
					//append the data 
					String newdata="Appended data !!!!!!!!!!!!!!!!!!!!!!!!!";
					
					writer=new FileWriter(filetoappend,true);	
					
					String newFileData=fileData.concat(newdata);
					writer.write(newFileData);
					
				  System.out.println("\nData Appended Successfully");
				} catch (IOException e) {
					e.printStackTrace();
				}
				finally {
					try {
						reader.close();
						writer.close();
					}
					catch(IOException e)
					{
						e.printStackTrace();
					}
				}
				System.out.println("\n--------------------------------------------------------");
				System.out.println();
				break;
			}
			case 4:break;
				
			default :System.out.println("Enter correct option !");
			System.out.println("\n--------------------------------------------------------");
			System.out.println();					
		}
		}while(ch!=4);
		
			System.out.println("\n--------------------------XXX--------------------------");

		
	}

}
