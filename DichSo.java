package baiTH;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class DichSo extends Thread {
	String so,ketqua;
	Socket ClientSocket;
	
	int id =-1;
	public DichSo(Socket socketClient,int id)
	{
		super();
		this.ClientSocket =socketClient;
		this.id=id;
	}
	
	public void run()
	{
		try 
		{
			
			System.out.print(ClientSocket.getInetAddress().getHostAddress());
			System.out.print(id);
			
			//tao luong nhap du lieu tu ban phim
	        DataInputStream banPhim = new DataInputStream(System.in);
	        //tao luong nhan du lieu tu server
	        DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream());
	        //tao luong gui du lieu len server
	        DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream());

	        System.out.println(inFromServer.readLine());
            System.out.println("nhap so :");
            so = banPhim.readLine();
            ketqua = inFromServer.readLine();
            
		}catch (Exception e) {
			System.err.println(e.getMessage());
		
		}
	}
	
}
