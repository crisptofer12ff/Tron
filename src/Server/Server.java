package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private static final int PORT = 7777;
	public static void main(String[] args) throws IOException {
		new Server().runServer();

	}
	public void runServer() throws IOException{
		ServerSocket serverSocket = new ServerSocket(PORT);
		System.out.println("Server up and ready for connections....");
		while(true){
			Socket socket = serverSocket.accept();
			new ServerThread(socket).start();
			
		}
		
	}

}
