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
		  
		  Socket s= ss.accept();
		  
		  Scanner sc = new Scanner(System.in);
		  
		  DataInputStream din = new DataInputStream(s.getInputStream());
		  
		   DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		  while(true)
		 {
		 
		    String content = din.readUTF();
		   
		   System.out.println("client:" + content);
		   
		   
		    System.out.print("Enter Message: \n");
		   
		    String inp = sc.nextLine();
		    
		    dout.writeUTF(inp);
		   
		    if(content.equalsIgnoreCase("bye") || inp.equalsIgnoreCase("bye"))
		   {
			   break;
		   }
		   
		   
		 }
		   
	  }
	  
	  catch(Exception e)
	  {
		  System.out.print(e);
	  }
  } 
}