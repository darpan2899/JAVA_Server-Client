import java.util.*;
import java.io.*;
import java.net.*;

class Client 
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			
			DatagramSocket ds = new DatagramSocket(3336);
			
			String msg,rmsg;
			
			DatagramPacket dps,dpr;
			
			byte [] bufr,bufs;
			
			InetAddress ip = InetAddress.getByName("localhost");
		    while(true)
		   {
            


            System.out.print("\n enter msg: \n");

             msg = sc.nextLine();

             bufs = new byte[1024];

             bufs= msg.getBytes();

             dps = new DatagramPacket(bufs,bufs.length,ip,3334);

             ds.send(dps);		  


             bufr = new byte[1024];

             dpr = new DatagramPacket(bufr,bufr.length);
			
			 ds.receive(dpr);

            rmsg = new  String(dpr.getData(),0,dpr.getLength());

             System.out.print("server : \n" + rmsg);	


             if(msg.equalsIgnoreCase("bye") ||  rmsg.equalsIgnoreCase("bye"))
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