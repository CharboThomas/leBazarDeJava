import java.io.*; 
import java.net.*;

public class MyServer {
    public static void main(String[] args){
   	System.out.println("Code serveur : ");
	try{
           ServerSocket ss=new ServerSocket(6666);// I create a socket at the port 6666
           Socket s=ss.accept();// I establishe connection
           DataInputStream dis=new DataInputStream(s.getInputStream());// I wait the message sent by the client
           String  str=(String)dis.readUTF();// I decod the message
           System.out.println("message= "+str);// I print the message sent by the client on the terminal
           ss.close();// I close the socket
        }catch(Exception e){
           System.out.println(e);
        }
    }
}
