package nc.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NCServerSocket {

	public static void main(String[] args) throws IOException {
		
		ServerSocket socket=new ServerSocket(6666);
		
		Socket sc=socket.accept();
		
		PrintWriter out=new PrintWriter(sc.getOutputStream(),true);
		out.println("Server:=> Client Connected...");
		BufferedReader input=new BufferedReader
				(new InputStreamReader(sc.getInputStream() ));
		
		String clientmsg=input.readLine();
		
		System.out.println("Client Message ::=> "+clientmsg);
		

	}

}
