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
		  
            String str = sc.nextLine();
			
			


            

             bufs = new byte[1024];

             bufs= str.getBytes();

             dps = new DatagramPacket(bufs,bufs.length,ip,3334);

             ds.send(dps);		  


             bufr = new byte[1024];

             dpr = new DatagramPacket(bufr,bufr.length);
			
			 ds.receive(dpr);

            rmsg = new  String(dpr.getData(),0,dpr.getLength());

             System.out.print("ans : \n" + rmsg);	

          
		}
		
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}