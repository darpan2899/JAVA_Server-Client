import java.util.*;
import java.net.*;
import java.io.*;

class FileServer
{
  public static void main(String args[])
  {
	  try
	 {

          ServerSocket ss = new ServerSocket(3334);
		  
		  Socket s= ss.accept();
		  
		  Scanner sc = new Scanner(System.in);
		  
		  DataInputStream din = new DataInputStream(s.getInputStream());
		  
		   DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		 
		 
		    String fname = din.readUTF();
		   
		   FileReader fr = new FileReader(fname);
		   
		   
		     int c;// = fr.read();
		     
		    do
			{
				 
				 c = fr.read();
				 dout.writeInt(c);
			}while((c)!=-1);
		   
		    s.close();
		    
		    ss.close();
		   
		   
		   
	  }
	  
	  catch(Exception e)
	  {
		  System.out.print(e);
	  }
  } 
}