package com.example.demo.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private final Integer PORT = 13;
	
	public Server() {
	
		try {
			Socket clientSocket;
			
			try (ServerSocket serverSocket = new ServerSocket(PORT)) {
				while(true) {
					System.out.println("------------- 1 Iniciando ServerSocket ---------------");
					System.out.println("------------- 2 A la espera de  clientSocket ---------");
					clientSocket = serverSocket.accept();
					System.out.println("------------- 3 Llegada de un clientSocket -----------");
					
					
					
					clientSocket.close();
					System.out.println("------------- 4 Finaliza atención al clientSocket ----");
				}
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Server();
	}
	
}