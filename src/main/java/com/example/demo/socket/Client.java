package com.example.demo.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	private final Integer PORT = 13;
	private final String IP = "localhost";
	
	public Client() {
		try {
			Socket clientSocket = new Socket(IP, PORT);
			System.out.println("------------- 1 Iniciando Comunicación ---------------");
			System.out.println("Inet Address : " + clientSocket.getInetAddress());
			
			System.out.println("------------- 2 Finalizando Comunicación -------------");
			clientSocket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Client();
	}
	
}
