package com.phase1.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FixBugs {

    public static void main(String[] args) {
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        optionsSelection();

    }
    private static void optionsSelection() {
    
    	ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        int  options;
	do {
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };
        
        for(String a:arr)
        	System.out.println(a);
            // display the all the Strings mentioned in the String array
        
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        options =  sc.nextInt();

                switch (options){
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        System.out.println(expenses+"\n");

                        break;
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                            System.out.println(expenses+"\n");

                               expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        break;
                    case 4:
                        sortExpenses(expenses);
                        break;
                    case 5:
                        searchExpenses(expenses);
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                                               
                }
                
    }while(options!=6 );

    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    private static void searchExpenses(ArrayList<Integer> arrayList) {
         int index=0,flag=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the expense you need to search:\t");
        int exp=scanner.nextInt();
        for(int i=0;i<arrayList.size();i++) {
        	if(arrayList.get(i)==exp) {
        		flag=1;
        		index=i+1;
        		break;
        	}else
           		flag=0;
        }
        if(flag==1)
        	System.out.println("This is at "+index+" Place in the List\n");
        else
        	System.out.println("Not present in the List \n");
        //Complete the method
    }
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
        
        Collections.sort(arrayList);
        System.out.println("Sorted Expenditure : "+arrayList +"\n");
        
       //Complete the method. The expenses should be sorted in ascending order.
    }
}