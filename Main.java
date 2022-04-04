package baiTH;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String soquydoi;
		 ServerSocket server = new ServerSocket(1202);
	     System.out.println("I`m listening on port 1202");
	     Socket connectionSocket = server.accept();
	   //tao luong nhan du lieu tu client
	        DataInputStream inFromClient = new DataInputStream(connectionSocket.getInputStream());
	        // tao luong gui du lieu toi client
	        DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
	        soquydoi= inFromClient.readLine();
	        int so = Integer.parseInt(soquydoi);
	        switch(so)

            {

                case 0:
                	System.out.println("Zero");
                break;

                case 1:
                	System.out.println("One");
                break;
                case 2:
                	System.out.println("Two");
                    break;
                case 3:
                	System.out.println("Three");
                    break;
                case 4:
                	System.out.println("Four");
                    break;
                case 5:
                	System.out.println("Five");
                    break;
                case 6:
                	System.out.println("Six");
                    break;
                case 7:
                	System.out.println("Seven");
                    break;
                case 8:
                	System.out.println("Eight");
                    break;
                case 9:
                	System.out.println("Nine");
                    break;
            }
	      //dong luong nhan du lieu tu client
	        inFromClient.close();
	        //dong luong gui du lieu ve client
	        outToClient.close();
	        //dong server socket
	        server.close();
	}

}
