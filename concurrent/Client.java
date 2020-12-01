import java.util.*;
import java.net.*;
import java.io.*;

class Client
{
  public static void main(String args[])
  {
	  try
	  {

          Socket s = new Socket("localhost",3334);
		  
		  Scanner sc = new Scanner(System.in);
		  
		  DataInputStream din = new DataInputStream(s.getInputStream());		  
		   DataOutputStream dout = new DataOutputStream(s.getOutputStream());

                                  if(s.isConnected());
                                 {
                                   System.out.print("connected \n");
                                  }
		  while(true)
		 {
		 
		   System.out.print("Enter Message \n");
		   
		   String inp = sc.nextLine();
		   
		   dout.writeUTF(inp);
		   
		   if(inp.equalsIgnoreCase("bye") )
		   {
			   break;
		   }
		   
		   String content = din.readUTF();
		   
		   System.out.println("server:" + content);

           if( content.equalsIgnoreCase("bye") )
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