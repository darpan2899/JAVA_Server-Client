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
		  
		    Scanner sc = new Scanner(System.in);
		  
		    DataInputStream din = new DataInputStream(s.getInputStream());		  
		     DataOutputStream dout = new DataOutputStream(s.getOutputStream());

              if(s.isConnected());
               {
                  System.out.print("connected \n");
                 }
				 
				 int no,n1;
				 
				 
				 for(int i=0;i<10;i++)
				 {
					 no=sc.nextInt();
					 dout.writeInt(no);
				 }
				 
				 
				 for(int i=0;i<10;i++)
				 {
			       n1=din.readInt();
				   System.out.println(n1);
				 }
				 
	  }
       catch(Exception e)
  	   {
		  e.printStackTrace();
	  }
   }  
}