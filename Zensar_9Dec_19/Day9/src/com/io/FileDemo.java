package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		try
		{
		File file = new File("foo");
		if(file.exists()) {
			System.out.println("foo.txt exits");
		}
		else {
			file.createNewFile();
		}
		if(file.isFile()) {
			System.out.println("Length of the File:"+file.length());
		}
		File dir = new File("MyFolder");
		if(dir.exists()) {
			System.out.println("Dir exits");
		}
		else {
			dir.mkdir();
		}
		if(dir.isDirectory()) {
			System.out.println("Relative Path:"+dir.getPath());
			System.out.println("Absoulate Path:"+dir.getAbsolutePath());
		}
	    File myDir = new File("mydir"); //create a object
		myDir.mkdir(); //create a actual directory
		
		File myFile = new File(myDir,"myFile.txt");
		myFile.createNewFile();//Create a new File in the Directory
		
			
        File existingDir = new File("existingDir");
		System.out.println(existingDir.isDirectory());
		
		File existingDirFile = new File(existingDir,"existingDirFile.txt");
		System.out.println(existingDirFile.isFile());
		
			
         File delDir = new File("deldir");
		delDir.mkdir();//make a directory
		
		File delFile1 = new File(delDir,"delFile1.txt");
		
		delFile1.createNewFile();//make a file
		
		File delFile2 = new File(delDir,"delFile2.txt");
		delFile2.createNewFile(); //add a file to directory
		
		delFile1.delete();
		System.out.println("delDir is "+delDir.delete());
		
	    File newName = new File(delDir,"myfile.txt");
		delFile2.renameTo(newName); //rename a file
		
		File newDir = new File("newDir");
		delDir.renameTo(newDir); //rename a directory
				
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		

	}

	}


