import java.io.*;
import java.net.*;

public class MyClient {

    public static void main(String[] args) {
	System.out.println("Code client");
    	try{
    		Socket s=new Socket("localhost",6666);
    		DataOutputStream dout=new DataOutputStream(s.getOutputStream());// I create a kind of "paquet"
    		dout.writeUTF("Thomas Charbonnet");// I whrite my name on the paquet
		System.out.println("Data transmit to the server");
    		dout.flush();// I sent the paquet to the server socket
    		dout.close();// I destroy my old paquet (to be honnest I don't really understand this command)
    		s.close();// I close my socket
    	}catch(Exception e){
		System.out.println(e);
	}
    }
}
