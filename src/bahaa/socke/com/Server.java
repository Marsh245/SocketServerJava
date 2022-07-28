package bahaa.socke.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

 
public class Server {

	public static void main(String[]args) throws IOException{
		
		ServerSocket serverSocket = new ServerSocket(5678);
		Socket socket = serverSocket.accept();
		
		Scanner fromConsole = new Scanner(System.in);
		
		Scanner fromClient = new Scanner(socket.getInputStream());//inputStream
		PrintWriter fromServer =  new PrintWriter(socket.getOutputStream()); // outputStream
		
		//BufferedReader reader = new BufferedReader (new InputStreamReader(socket.getInputStream()));
        //DataOutputStream 
		
		String inputfromServer,inputfromConsole;
		
		while(true) {
			inputfromServer = fromClient.nextLine();
			System.out.println("Client: "+ inputfromServer);
			
			System.out.print("Server: ");
			
			inputfromConsole = fromConsole.nextLine(); //
			fromServer.println(inputfromConsole);
			
			fromServer.flush(); // flush command send the data to the other  side  of the socket 
		
			
		}
		
		
		
		
		
	
	}
	
	
}
