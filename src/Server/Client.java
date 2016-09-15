package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private Socket sock;
	private PrintWriter printWriter; 
	private BufferedReader bufferedReader;
	private String ip;
	private String readerInput;
	
	public Client(String ip, int PORT) throws UnknownHostException, IOException{
		this.ip = ip;
		this.sock = new Socket(ip, PORT);
		System.out.println("Conectado a: "+ this.ip);
		this.printWriter = new PrintWriter(sock.getOutputStream(), true);
		this.bufferedReader = new java.io.BufferedReader(new InputStreamReader(this.sock.getInputStream()));
	}
	public void reader() throws UnknownHostException, IOException{
		
		this.readerInput = bufferedReader.readLine();
		if(this.readerInput != null){
			System.out.println("Bien hecho...");
		}
		System.out.println("Dato recibido..." + this.readerInput.toString());
			
	}
	public void writer() throws UnknownHostException, IOException{
		String name = this.ip;
		printWriter.println(name + ": " + readerInput);
		}
	}
	/*
	public static void main(String[] args) throws UnknownHostException, IOException{
		String name = args[0];
		Socket sock = new Socket("localhost", 7777);
		PrintWriter printWriter = new PrintWriter(sock.getOutputStream(), true);
		BufferedReader bufferedReader = new java.io.BufferedReader(new InputStreamReader(System.in));
		while(true){
			String readerInput = bufferedReader.readLine();
			printWriter.println(name + ": " + readerInput);
		}
		*/
	

