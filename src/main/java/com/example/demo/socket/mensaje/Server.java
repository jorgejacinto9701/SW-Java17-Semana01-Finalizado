package com.example.demo.socket.mensaje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private final Integer PORT = 13;
	
	public Server() {
	
		try {
			Socket clientSocket;
			
			ServerSocket serverSocket = new ServerSocket(PORT);
			while(true) {
				System.out.println("------------- 1 Iniciando ServerSocket ---------------");
				System.out.println("------------- 2 A la espera de  clientSocket ---------");
				clientSocket = serverSocket.accept();
				System.out.println("------------- 3 Llegada de un clientSocket -----------");
				
				//Flujos de comunicación
				BufferedReader entrada = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				PrintWriter salida = new PrintWriter(clientSocket.getOutputStream(),true);
				
				
				String opcion = entrada.readLine();
				System.out.println("------------- 4 opción > "+ opcion +"-----------");
				switch (opcion) {
					case "Platea": 		salida.println("Paga PEN 50");
					case "Vip": 		salida.println("Paga PEN 150");
					case "Platinium": 	salida.println("Paga PEN 250");
				}

				clientSocket.close();
				System.out.println("------------- 5 Finaliza atención al clientSocket ----");
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