import java.util.*;
import java.net.*;
import java.io.*;

class ServerThread extends Thread
{
	Socket s;
	ServerThread(Socket s)
	{
	   this.s=s;	
	}
  public void run()
  {
	  
		  try
		  {
		  DataInputStream din = new DataInputStream(s.getInputStream());
		  
		   DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		  
		 
		    String content = din.readUTF();
		   
		   System.out.println("client:" + content);
		   
		   
		    StringBuffer sb = new StringBuffer(content);
		   
		    sb= sb.reverse();
			
			String inp = new String(sb);
		    
		    dout.writeUTF(inp);
			
			
		   
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		   
		 
		   
	  
	  
	  
  } 
}