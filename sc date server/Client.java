import java.util.*;
import java.net.*;
import java.io.*;

class Client
{
  public static void main(String args[])
  {
	  try
	  {

            Socket s = new Socket("localhost",3333);
		  
		   
		  
		    DataInputStream din = new DataInputStream(s.getInputStream());		  
		  

              if(s.isConnected());
               {
                  System.out.print("connected \n");
                 }
				String inp = din.readUTF();
				
				System.out.println("current date and time " + inp);
				 
	  }
       catch(Exception e)
  	   {
		  e.printStackTrace();
	  }
   }  
}