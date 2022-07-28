package bahaa.socke.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;
 
public class Client {
	
	public static void main(String[]args){
		
		
		// Socket(host,port) host is the Ip addres of my machine 127.0.0.1 = localhost
 		
	    try {
	    	
			Socket socket = new Socket("127.0.0.1", 8080);
   
			// input from Console  System.in
			Scanner fromConsole =  new Scanner(System.in);
			
			Scanner fromServer = new Scanner (socket.getInputStream());
		    PrintWriter fromClient = new PrintWriter(socket.getOutputStream(),true ); // true is for autoFlush 
		    
		    
		    String input,output;
		    while (true) {
		    	System.out.print("Client : ");
		    	input = fromConsole.nextLine();
		    	
		    	
		    	fromClient.println(input);
		    	
		    	output = fromServer.nextLine();
		    	System.out.print("Server: ");
		    	System.out.println(output);
		    	
		    	
		    }
		    
		    
		    

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
