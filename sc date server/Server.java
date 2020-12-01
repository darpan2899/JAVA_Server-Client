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
		 
		  
		   DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		 Date dobj = new Date();
		 
		 String oup = dobj.toString();
		 
		 dout.writeUTF(oup);
		   
	  }
	  
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  } 
}