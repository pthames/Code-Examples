import java.io.IOException;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Scanner;

//Coding Assignment 5, Phillip Thames
//4-2-2017, Multiple Clients Program with names

public class Clients {
	
	static Socket clientSocket;
	static int client_ID;
	static String message, name;
	static Scanner input;
	
	public static void main(String[] args) throws IOException 
	{
	      	      
		try{

			  System.out.println("Client is now connecting to the Server");
		 
			clientSocket = new Socket("localhost", 7777);
			
			System.out.println("Client is now connected to server.");			
			
						
		    // gets client ID from the server	    
		    DataInputStream readFromServer = new DataInputStream(clientSocket.getInputStream());		   
		    client_ID = readFromServer.readInt();		    
		    
		    //asks user for a client name to go with the ID and sends it to the server
		    input = new Scanner(System.in);
		    System.out.println("Your Client ID is: " + client_ID);
			System.out.println("Please enter a name for this client: ");			
			name = input.nextLine();
			DataOutputStream writeToServer = new DataOutputStream(clientSocket.getOutputStream());
			writeToServer.writeUTF(name);
		    
		    
		    
		    
		    clientSocket.close();		   
		    readFromServer.close();
			writeToServer.close();	
			
		}catch(IOException err) {
		    err.printStackTrace();
		  }
		

	
      }
}
