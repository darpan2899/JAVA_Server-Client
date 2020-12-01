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
            int A[] = new int[10];

           for(int i=0;i<10;i++)
		   {
			   A[i]=Integer.parseInt(st.nextToken());
		   }
		   
		   Arrays.sort(A);
		   
		   System.out.println();
           for(int i=0;i<10;i++)
		   {
			   System.out.println(A[i]);
		   }

            String str = Arrays.toString(A);
			
		
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