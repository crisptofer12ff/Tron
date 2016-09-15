package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread extends Thread{
	Socket sock;
	ServerThread(Socket socket){
		this.sock = socket;
	}
	public void run(){
		try{
			String message = null;
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			while ((message = bufferedReader.readLine()) != null){
				System.out.printf(" Incoming %s message: %s \n",sock.toString(), message);
			}
			sock.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
