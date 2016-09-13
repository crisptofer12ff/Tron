package Server;

import java.io.IOException;
import java.net.Socket;

public class Thread extends Thread {
	Socket socket;
	ServerThread(Socket socket){
		this.socket = socket;
	}
	public void run(){
		try {
			BufferesReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while((message = bufferedReader.readLine())!=null){
				System.out.println("incoming message from client: "+ message);
			}
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
