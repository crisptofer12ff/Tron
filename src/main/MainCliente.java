package main;

import java.io.IOException;
import java.net.UnknownHostException;

import Server.Client;

public class MainCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Client client = new Client("127.0.0.1",7777);
		while(true){
			client.reader();
		}

	}

}
