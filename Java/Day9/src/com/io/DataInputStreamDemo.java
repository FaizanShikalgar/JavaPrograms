package com.io;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamDemo {

	public static void main(String[] args) {
		 //writing the data. 
        try ( DataOutputStream dout = 
                    new DataOutputStream(new FileOutputStream("file.dat")) ) 
        { 
            dout.writeDouble(1.1); 
            dout.writeInt(55); 
            dout.writeBoolean(true); 
            dout.writeChar('4'); 
        } 
          
        catch(FileNotFoundException ex) 
        { 
            System.out.println("Cannot Open the Output File"); 
            
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
          
        // reading the data back. 
        try ( DataInputStream din = 
                    new DataInputStream(new FileInputStream("file.dat")) ) 
        { 
   
                         //illustrating readDouble() method 
            double a = din.readDouble(); 
                         //illustrating readInt() method 
            int b = din.readInt(); 
                         //illustrating readBoolean() method 
            boolean c = din.readBoolean(); 
                         //illustrating readChar() method 
            char d=din.readChar(); 
            System.out.println("Values: " + a + " " + b + " " + c+" " + d); 
        } 
        catch(FileNotFoundException e) 
        { 
            System.out.println("Cannot Open the Input File"); 
             
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    } 

	}

