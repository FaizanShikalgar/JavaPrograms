package com.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) 
    { 
        // Declare the object and initialize with 
        // predefined standard input object 
        Scanner sc = new Scanner("manasi F 25 7854123669 78"); 
      
        // String input 
        while(sc.hasNext()) {
        	System.out.println("Inside the loop");
        String name = sc.next(); 
  
        // Character input 
        char gender = sc.next().charAt(0); 
  
        // Numerical data input 
        // byte, short and float can be read 
        // using similar-named functions. 
        int age = sc.nextInt(); 
        long mobileNo = sc.nextLong(); 
        double cgpa = sc.nextDouble(); 
       
        // Print the values to check if input was correctly obtained. 
        System.out.println("Name: "+name); 
       // System.out.println("Gender: "+gender); 
        System.out.println("Age: "+age); 
        System.out.println("Mobile Number: "+mobileNo); 
        System.out.println("CGPA: "+cgpa); 
        
        
        Scanner scan = new Scanner("Anna Mills/Female/18");
        // initialize the string delimiter
        scan.useDelimiter("/");
        // Printing the tokenized Strings
        while(scan.hasNext()){
            System.out.println(scan.next());
        }
        // closing the scanner stream
        scan.close();
        }
    } 
}
