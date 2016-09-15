package main;

import java.io.IOException;

import Server.Server;

public class Main {

	public static void main(String[] args) throws IOException {
		Server server = new Server();
		server.runServer();
	}

}
