import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;

// Coding Assignment 5, Phillip Thames
// 4-2-2017, Multiple Clients Program with names

public class Server {
	
	static ServerSocket hostSocket;
	static Socket clientSocket_1, clientSocket_2;
	static int client_1_ID, client_2_ID;
	static Random rand = new Random();
	static String client_1_name,client_2_name; 
	
	
	
	 public static void main(String[]args)  throws IOException {
		try{
			
			System.out.println("Server is running and is now waiting for connection from the clients.");
			
			
			
			hostSocket= new ServerSocket(7777, 2);
			clientSocket_1 = hostSocket.accept();
			clientSocket_2 = hostSocket.accept();
			
					
			System.out.println("Clients are now connected with the server.");
			
		    //sets client_1_ID and sends it to first client
			//then gets client name
			client_1_ID = rand.nextInt(1001) + 1000;
			DataOutputStream writeToClient_1 = new DataOutputStream(clientSocket_1.getOutputStream());
			writeToClient_1.writeInt(client_1_ID);
			DataInputStream readFromClient_1= new DataInputStream(clientSocket_1.getInputStream());
			client_1_name = readFromClient_1.readUTF();
			
			//sets client_2_ID and sends it to second client
			//then gets client name
			client_2_ID = rand.nextInt(1001) + 1000;
			DataOutputStream writeToClient_2 = new DataOutputStream(clientSocket_2.getOutputStream());			
			writeToClient_2.writeInt(client_2_ID);
			DataInputStream readFromClient_2= new DataInputStream(clientSocket_2.getInputStream());
			client_2_name = readFromClient_2.readUTF();
			
			System.out.println("Client 1 ID: " + client_1_ID + ", Client 1 Name: " + client_1_name + ".");
			System.out.println("Client 2 ID: " + client_2_ID + ", Client 2 Name: " + client_2_name + ".");
			
			
			System.out.println("Program finished and exiting.");
		    
			clientSocket_1.close();
			clientSocket_2.close();
			readFromClient_1.close();
			readFromClient_2.close();
			writeToClient_1.close();
			writeToClient_2.close();			
			hostSocket.close();
			
			
			
			
			
		}catch(IOException err) {
		    err.printStackTrace();
		  }
		
		
	}

}

