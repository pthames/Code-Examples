import java.io.IOException;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Scanner;

//Final Project, Phillip Thames
//5-2-2017, Battleship

public class Clients {

	static Socket clientSocket;
	static String guess;
	static String message;
	static Scanner input = new Scanner(System.in);
	static String client_ID;
	static String board;
	static String pickedTiles = "";
	static boolean gameover, turn, badpick;

	public static void main(String[] args) throws IOException {

		try {
             //connects
			System.out.println("Client is now connecting to the Server");
			clientSocket = new Socket("localhost", 7777);
			System.out.println("Client is now connected to server.");
			System.out.println("***********************************************\n\n");
			
              //streams
			DataInputStream readFromServer = new DataInputStream(clientSocket.getInputStream());
			DataOutputStream writeToServer = new DataOutputStream(clientSocket.getOutputStream());
			client_ID = readFromServer.readUTF();
			
            //welcome and set some game values
			System.out.println("Welcome To Battleship!!  " + client_ID);
			gameover = readFromServer.readBoolean();
			board = readFromServer.readUTF();
			System.out.println(board);	
			turn = false;
         
			
			//starts game for each client
			while (false == gameover) {
				turn = readFromServer.readBoolean();
				while (true == turn){

				System.out.println(client_ID + "Choose a tile to strike: ");
				guess = input.next();
				
                checkGuess(guess);
                
				while( badpick == false) {
					guess = input.nextLine();
					checkGuess(guess);
					}
				
				guess = guess.toUpperCase();
				writeToServer.writeUTF(guess);

				board = readFromServer.readUTF();
				System.out.println(board);				
				turn = readFromServer.readBoolean();
				message = readFromServer.readUTF();
				System.out.println(message);
				}
				
				gameover = readFromServer.readBoolean();
			}
			
			//when game is over
			message = readFromServer.readUTF();
			System.out.println(message);
			System.out.println("Program finished and exiting.");
			
			
			input.close();			
			readFromServer.close();
			writeToServer.close();
			clientSocket.close();

		} catch (IOException err) {
			err.printStackTrace();
		}

	}
 
	//methods below
	public static void checkGuess(String a) {
		guess = a;
		if (guess.matches("^[a-eA-E]{1}[1-5]{1}$") && (false == pickedTiles.contains(guess))) {
 
			pickedTiles = pickedTiles + guess;
			badpick = true;
		} else if (pickedTiles.contains(guess)){
			System.out.println("Already Picked that one .");
			badpick =  false;	
		}else{
			System.out.println("Invalid entry");
			badpick = false;
		}
	}

}
