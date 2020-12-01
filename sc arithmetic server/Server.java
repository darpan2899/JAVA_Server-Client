import java.util.*;
import java.io.*;
import java.net.*;



class Server 
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			
			DatagramSocket ds = new DatagramSocket(3334);
			
			String msg,rmsg;
			
			DatagramPacket dps,dpr;
			
			byte [] bufr,bufs;
			
			InetAddress ip = InetAddress.getByName("localhost");
		   
             bufr = new byte[1024];

            dpr = new DatagramPacket(bufr,bufr.length);
			
			ds.receive(dpr);

            rmsg = new String(dpr.getData(),0,dpr.getLength());

            System.out.print("client : \n" + rmsg);
		  
           StringTokenizer st = new StringTokenizer(rmsg);
           
		   int no1=Integer.parseInt(st.nextToken());
		   String op = st.nextToken();
		   int no2=Integer.parseInt(st.nextToken());
		   
		   int c=0;
		   
		   
           switch(op)
		   {
			   case "+":
			              c= no1 + no2;
				          break;
			   case "-":
			              c= no1 - no2;
				          break;
			   case "*":
			              c= no1 * no2;
				          break;
						  
			  case "/":
			              c= no1 / no2;
				          break;
						  
			   default:
			             System.out.println("wrong choice");
						 break;
		   }
		   
		     String str = Integer.toString(c);
			
		
             bufs = new byte[1024];

             bufs= str.getBytes();
           

           dps = new DatagramPacket(bufs,bufs.length,ip,3336);

           ds.send(dps);		 

           
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}