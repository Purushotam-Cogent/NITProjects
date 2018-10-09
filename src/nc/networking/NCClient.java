package nc.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class NCClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket("localhost", 6666);
		
		System.out.println("Connection ......Done......");
		BufferedReader buff=new BufferedReader
				(new InputStreamReader(socket.getInputStream()));
		
		String message=buff.readLine();
		
		System.out.println("Server Message "+message);
		
		PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
		out.println("Thnkx for your port we got connected...");
		
		
		

	}

}
