package com.io;
import java.io.*;
class FileReadAndWrite 
{
	public static void main(String args[])
	{	
		FileInputStream fis = null;
		 FileOutputStream fos= null;
	    try
		{
		 BufferedInputStream bis=new BufferedInputStream(System.in);
		  fos=new FileOutputStream("MyFile.txt");
		  int s,x;
		   while( (s=bis.read())!=-1)
		  {    fos.write(s);
		       fos.flush();
		  }
		  fis = new FileInputStream("MyFile.txt");
		  fos = new FileOutputStream("copy.txt");
		 do{
			      x=fis.read();
				 System.out.println(x);
			     if(x!=-1)			
				 fos.write((char)x);
		    }while(x!=-1);
		  
		  }
		catch(Exception e)
		{
            e.printStackTrace();
        }
	    finally {
	    	try {
			fos.close();
			fis.close();
			
		}
	    catch(IOException ex) {
	    	ex.printStackTrace();
	    }

    }

}
}	
