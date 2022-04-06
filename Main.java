package baiTH;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) throws IOException {
		ServerSocket socketserver = new ServerSocket(7879);
		System.out.print("I'm listening on port..");
		int id=0;
		while(true) {
			Socket s = socketserver.accept();
			id++;
			DichSo dichSo = new DichSo(s,id);
			dichSo.start();
		}
	}

}