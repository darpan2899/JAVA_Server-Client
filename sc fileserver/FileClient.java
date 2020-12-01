import java.util.*;
import java.net.*;
import java.io.*;

class FileClient
{
  public static void main(String args[])
  {
	  try
	 {
		  
		  Socket s= new Socket("localhost",3334);
		  
		  Scanner sc = new Scanner(System.in);
		  
		  DataInputStream din = new DataInputStream(s.getInputStream());
		  
		   DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		 
		 
		    String fname = sc.nextLine();
		   
		     dout.writeUTF(fname);
		   
		   
		     int c = din.readInt();
		     
		    do
			{
				
				 System.out.print((char)c);
				 c = din.readInt();
				 
				
			}while((c)!=-1);
		   
		    
		    
		    s.close();
		   
		   
		   
	  }
	  
	  catch(Exception e)
	  {
		  System.out.print(e);
	  }
  } 
}