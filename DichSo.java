package baiTH;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class DichSo extends Thread{
	Socket socketClient;
	int id = -1;
	public DichSo(Socket socketClient, int id) {
		super();
		this.socketClient = socketClient;
		this.id = id;
	}
	public void run() {
		try {
			System.out.print(socketClient.getInetAddress().getHostAddress());
			System.out.print(id);
			
			OutputStream osToClient = socketClient.getOutputStream();
			OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
			BufferedWriter buffWrite = new BufferedWriter(write2client);
			
			InputStream in = socketClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);
			
			while(true){
				String chuoiNhan=buffRead.readLine();
				System.out.println(chuoiNhan);
				
				if(chuoiNhan.equals("0"))
				{
					String chuoiGui= "zero";
					buffWrite.write(chuoiGui+"\n");
					buffWrite.flush();
				}
				if(chuoiNhan.equals("1")) 
				{
					String chuoiGui= "one";
					buffWrite.write(chuoiGui+"\n");
					buffWrite.flush();
				} 
				if(chuoiNhan.equals("2")) 
				{
					String chuoiGui= "two";
					buffWrite.write(chuoiGui+"\n");
					buffWrite.flush();
				}
				if(chuoiNhan.equals("3")) 
				{
					String chuoiGui= "three";
					buffWrite.write(chuoiGui+"\n");
					buffWrite.flush();
				}
				if(chuoiNhan.equals("4")) 
				{
					String chuoiGui= "four";
					buffWrite.write(chuoiGui+"\n");
					buffWrite.flush();
				}
				if(chuoiNhan.equals("5")) 
				{
					String chuoiGui= "five";
					buffWrite.write(chuoiGui+"\n");
					buffWrite.flush();
				}
				if(chuoiNhan.equals("6")) 
				{
					String chuoiGui= "six";
					buffWrite.write(chuoiGui+"\n");
					buffWrite.flush();
				}
				if(chuoiNhan.equals("7")) 
				{
					String chuoiGui= "seven";
					buffWrite.write(chuoiGui+"\n");
					buffWrite.flush();
				}
				if(chuoiNhan.equals("8")) 
				{
					String chuoiGui= "eight";
					buffWrite.write(chuoiGui+"\n");
					buffWrite.flush();
				}
				if(chuoiNhan.equals("9")) 
				{
					String chuoiGui= "nine";
					buffWrite.write(chuoiGui+"\n");
					buffWrite.flush();
				}
				if(chuoiNhan.equals("10")) 
				{
					break;
				}
				
			}
			socketClient.close();
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}
}