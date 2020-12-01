import java.util.*;
import java.net.*;
import java.io.*;

class Server
{
  public static void main(String args[])
  {
	  try
	 {

         ServerSocket ss = new ServerSocket(3334);
		  
		  
		  
		  

		  while(true)
		 {
		 
		   Socket s= ss.accept();
		   
		   ServerThread st = new ServerThread(s);
		   
		   st.start();
		   
		 }
		   
	  }
	  
	  catch(Exception e)
	  {
		  System.out.print(e);
	  }
  } 
}