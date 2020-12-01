import java.util.*;
import java.net.*;
import java.io.*;

class Server
{
  public static void main(String args[])
  {
	  try
	 {

         ServerSocket ss = new ServerSocket(3333);
		  
		  Socket s= ss.accept();
		  
		  Scanner sc = new Scanner(System.in);
		  
		  DataInputStream din = new DataInputStream(s.getInputStream());
		  
		   DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		   
		   int A[]=new int[10];
		   

		   for(int i=0;i<10;i++)
				 {
			       A[i]=din.readInt();
				
				   
				 }
				 
				 Arrays.sort(A);
				 
				 for(int i=0;i<10;i++)
				 {
			       dout.writeInt(A[i]);
			
				   
				 }
				
		   
	  }
	  
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  } 
}