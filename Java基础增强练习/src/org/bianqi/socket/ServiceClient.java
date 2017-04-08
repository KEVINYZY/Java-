package org.bianqi.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServiceClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost", 12348);
		InputStream inputStream = socket.getInputStream();
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream);
		printWriter.println("hello");
		printWriter.flush();
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		String result = br.readLine();
		System.out.println(result);
		inputStream.close();
		outputStream.close();
		socket.close();
	}
}
