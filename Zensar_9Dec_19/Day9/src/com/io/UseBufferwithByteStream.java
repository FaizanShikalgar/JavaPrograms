package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UseBufferwithByteStream {

	public static void main(String[] args) {

		try {
			FileOutputStream fout=
					new FileOutputStream("E:\\testout.txt");    
			 BufferedOutputStream bout=
					 new BufferedOutputStream(fout);  
			  String s="Using The BufferOutputStram With File.";    
			 byte b[]=s.getBytes();    
			 bout.write(b);    
			 bout.flush();    
			 bout.close();    
			 fout.close();    
			 System.out.println("success");
			 
			  FileInputStream fin=
					  new FileInputStream("E:\\testout.txt");    
			    BufferedInputStream bin=
			    		new BufferedInputStream(fin);    
			    int i;    
			    while((i=bin.read())!=-1){    
			     System.out.print((char)i);    
			    }    
			    bin.close();    
			    fin.close();    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    

	}

}
