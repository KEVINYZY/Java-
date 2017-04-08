package org.bianqi.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServiceServer {
	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket();
		socket.bind(new InetSocketAddress("localhost", 12345));
		while(true){
			Socket s = socket.accept();
			new Thread(new ServiceServerTask(s)).start();
		}
	}
}
