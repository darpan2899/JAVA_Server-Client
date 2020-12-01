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
		   
		   StringBuffer sb = new StringBuffer(content);
		   
		   sb = sb.reverse();
		   
		   char ch[] = new char[1024];
		   
		   String str =  new String(sb);
		   
		   System.out.println(str);
		   
		   
		   for(int i=0;i<str.length();i++)
		   {
			   if(Character.isUpperCase(str.charAt(i)))
			   {
				   ch[i]= Character.toLowerCase(str.charAt(i));
			   }
			   else
			   {
				   ch[i]= Character.toUpperCase(str.charAt(i));
			   }
		   }
		   
		
		    
		   
		    String inp = ch.toString();
			
			System.out.println(inp);
		    
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