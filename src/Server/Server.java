package Server;

import java.net.ServerSocket;

public class Server {
	public static final int PORT = 4444;
	public static void main(String[] args) throws IOException{
		new Server().runServer();
	}
	public void runServer() trows IOException{
		ServerSocket serverSocket = ServerSocket(PORT);
		while(true){
			Socket socket = serverSocket.accept();
			new ServerThread(socket).start();
			
			
		}
		
	}

}
//This is my second test
//hello 
