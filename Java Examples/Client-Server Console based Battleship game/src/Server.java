
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

// Final Project, Phillip Thames
// 5-2-2017, Battleship

public class Server {

	static ServerSocket hostSocket;
	static Socket clientSocket_1, clientSocket_2;
	static String guess1, guess2;
	static String client_1_ID = "Player 1";
	static String client_2_ID = "Player 2";
	static Random rand = new Random();
	static ArrayList<String> ships1 = new ArrayList<String>();
	static ArrayList<String> ships2 = new ArrayList<String>();
	static String newBoard1, newBoard2, update1, update2;
	static String[] board1 = new String[25];
	static String[] board2 = new String[25];
	static boolean gameover = false;
	static boolean turn1, turn2;
	static int player1Score, player2Score = 0;
	

	public static void main(String[] args) throws IOException {
		try {
              
			//first connects
			System.out.println("Server is running and is now waiting for connection from the clients.");
			hostSocket = new ServerSocket(7777, 2);
			clientSocket_1 = hostSocket.accept();
			clientSocket_2 = hostSocket.accept();
			System.out.println("Clients are now connected with the server.");
			
            //streams
			DataOutputStream writeToClient_1 = new DataOutputStream(clientSocket_1.getOutputStream());
			writeToClient_1.writeUTF(client_1_ID);
			DataOutputStream writeToClient_2 = new DataOutputStream(clientSocket_2.getOutputStream());
			writeToClient_2.writeUTF(client_2_ID);
			
              //sets some game values
			writeToClient_1.writeBoolean(gameover);
			writeToClient_2.writeBoolean(gameover);
			turn1 = true;
			turn2 = true;
		

             //creates the boards and loads ships
			createBoard1();
			createBoard2();			
			newBoard1 = printBoard1();
			newBoard2 = printBoard2();
			writeToClient_1.writeUTF(newBoard1 + newBoard2);
			writeToClient_2.writeUTF(newBoard1 + newBoard2);
			placeShips1();
			placeShips2();
			
               //streams
			DataInputStream readFromClient_1 = new DataInputStream(clientSocket_1.getInputStream());
			DataInputStream readFromClient_2 = new DataInputStream(clientSocket_2.getInputStream());
			
			//game starts
			while (false == gameover) {
				//player 1 go
				writeToClient_1.writeBoolean(turn1);                
				guess1 = readFromClient_1.readUTF();
			    update1 = updateBoard1(guess1);
				newBoard1 = printBoard1();
				newBoard2 = printBoard2();
				writeToClient_1.writeUTF(update1 + newBoard1 + newBoard2);
				writeToClient_1.writeBoolean(!turn1); 	
				writeToClient_1.writeUTF("Wait your turn.........");
				writeToClient_1.writeBoolean(gameover); 
				
                //player 2 go
				writeToClient_2.writeBoolean(turn2);  
				guess2 = readFromClient_2.readUTF();				
			    update2 = updateBoard2(guess2);
				newBoard1 = printBoard1();
				newBoard2 = printBoard2();
				writeToClient_2.writeUTF(update2 + newBoard1 + newBoard2);
				writeToClient_2.writeBoolean(!turn2); 
				writeToClient_2.writeUTF("Wait your turn.........");
				writeToClient_2.writeBoolean(gameover); 
				
				//checks scores and ends game if winner
				if(player1Score == 7 && player2Score < 7){					
					writeToClient_1.writeBoolean(!turn1); 
					writeToClient_1.writeBoolean(!gameover); 
					writeToClient_1.writeUTF("Player 1 Wins!\n" +
					"Player 1 Score: " + player1Score + "\nPlayer 2 Score: " + player2Score);
					writeToClient_2.writeBoolean(!turn2); 
					writeToClient_2.writeBoolean(!gameover); 
					writeToClient_2.writeUTF("Player 1 Wins!\n" +
				"Player 1 Score: " + player1Score + "\nPlayer 2 Score: " + player2Score);
					gameover = true;
					
				}
				
				//checks scores and ends game if winner
				if(player2Score == 7 && player1Score < 7){					
					writeToClient_2.writeBoolean(!turn2); 				
					writeToClient_2.writeBoolean(!gameover); 
					writeToClient_2.writeUTF("Player 2 Wins!\n" +
					"Player 1 Score: " + player1Score + "\nPlayer 2 Score: " + player2Score);
					writeToClient_1.writeBoolean(!turn1);  
					writeToClient_1.writeBoolean(!gameover); 
					writeToClient_1.writeUTF("Player 2 Wins!" +
					"Player 1 Score: " + player1Score + "\nPlayer 2 Score: " + player2Score);
					gameover = true;
				}
				
				//checks scores and ends game if tie
				if(player2Score == 7 && player1Score == 7){					
					writeToClient_2.writeBoolean(!turn2); 				
					writeToClient_2.writeBoolean(!gameover); 
					writeToClient_2.writeUTF("Its a TIE!\n" +
					"Player 1 Score: " + player1Score + "\nPlayer 2 Score: " + player2Score);
					writeToClient_1.writeBoolean(!turn1);  
					writeToClient_1.writeBoolean(!gameover); 
					writeToClient_1.writeUTF("Its a TIE!" +
					"Player 1 Score: " + player1Score + "\nPlayer 2 Score: " + player2Score);
					gameover = true;
				}			
			
			
                
			}
			
			

			System.out.println("Program finished and exiting.");

			clientSocket_1.close();
			clientSocket_2.close();
			readFromClient_1.close();
			readFromClient_2.close();
			writeToClient_1.close();
			writeToClient_2.close();
			hostSocket.close();

		} catch (IOException err) {
			err.printStackTrace();
		}

	}

	//methods below
	
	public static void createBoard1() {
		board1[0] = "A1";
		board1[1] = "A2";
		board1[2] = "A3";
		board1[3] = "A4";
		board1[4] = "A5";
		board1[5] = "B1";
		board1[6] = "B2";
		board1[7] = "B3";
		board1[8] = "B4";
		board1[9] = "B5";
		board1[10] = "C1";
		board1[11] = "C2";
		board1[12] = "C3";
		board1[13] = "C4";
		board1[14] = "C5";
		board1[15] = "D1";
		board1[16] = "D2";
		board1[17] = "D3";
		board1[18] = "D4";
		board1[19] = "D5";
		board1[20] = "E1";
		board1[21] = "E2";
		board1[22] = "E3";
		board1[23] = "E4";
		board1[24] = "E5";

	}

	public static String printBoard1() {

		String strBoard1 = "Player 1's Ships\n" + "_________________\n" +
		"|" + board1[0] + "|" + board1[1] + "|"	+ board1[2] + "|" + board1[3] + "|" + board1[4] + "|\n" + "|" + board1[5] + "|" + board1[6] + "|"
				+ board1[7] + "|" + board1[8] + "|" + board1[9] + "|\n" + "|" + board1[10] + "|" + board1[11] + "|"
				+ board1[12] + "|" + board1[13] + "|" + board1[14] + "|\n" + "|" + board1[15] + "|" + board1[16] + "|"
				+ board1[17] + "|" + board1[18] + "|" + board1[19] + "|\n" + "|" + board1[20] + "|" + board1[21] + "|"
				+ board1[22] + "|" + board1[23] + "|" + board1[24] + "|\n" + 
				"_________________\n"
				+ "############################################\n";
		return strBoard1;
	}

	public static void createBoard2() {
		board2[0] = "A1";
		board2[1] = "A2";
		board2[2] = "A3";
		board2[3] = "A4";
		board2[4] = "A5";
		board2[5] = "B1";
		board2[6] = "B2";
		board2[7] = "B3";
		board2[8] = "B4";
		board2[9] = "B5";
		board2[10] = "C1";
		board2[11] = "C2";
		board2[12] = "C3";
		board2[13] = "C4";
		board2[14] = "C5";
		board2[15] = "D1";
		board2[16] = "D2";
		board2[17] = "D3";
		board2[18] = "D4";
		board2[19] = "D5";
		board2[20] = "E1";
		board2[21] = "E2";
		board2[22] = "E3";
		board2[23] = "E4";
		board2[24] = "E5";

	}

	public static String printBoard2() {

		String strBoard2 = "Player 2's Ships\n" + "_________________\n" + "|" + board2[0] + "|" + board2[1] + "|"
				+ board2[2] + "|" + board2[3] + "|" + board2[4] + "|\n" + "|" + board2[5] + "|" + board2[6] + "|"
				+ board2[7] + "|" + board2[8] + "|" + board2[9] + "|\n" + "|" + board2[10] + "|" + board2[11] + "|"
				+ board2[12] + "|" + board2[13] + "|" + board2[14] + "|\n" + "|" + board2[15] + "|" + board2[16] + "|"
				+ board2[17] + "|" + board2[18] + "|" + board2[19] + "|\n" + "|" + board2[20] + "|" + board2[21] + "|"
				+ board2[22] + "|" + board2[23] + "|" + board2[24] + "|\n" + "_________________\n"
				+ "#################################################";
		return strBoard2;
	}

	public static void placeShips1() {
		while (ships1.size() < 8) {
			int shipPosition = rand.nextInt(24);
			if (!ships1.contains(board1[shipPosition])) {
				ships1.add(board1[shipPosition]);
			}
		}
		System.out.println("Player 1's Boats at" + ships1);
	}

	public static void placeShips2() {
		while (ships2.size() < 8) {
			int shipPosition = rand.nextInt(24);
			if (!ships2.contains(board2[shipPosition])) {
				ships2.add(board2[shipPosition]);
			}
		}
		System.out.println("Player 2's Boats at" + ships2);
	}

	public static String updateBoard1(String a) {
		 String guess = a;
		
		if (ships2.contains(guess)) {
			System.out.println("P1 - Hit @ " + guess);
			for (int i = 0; i < board2.length; i++) {
				if (board2[i].equals(guess)) {
					board2[i] = "HIT";
					player1Score = player1Score + 1;
					System.out.println("Player 1 Score" + player1Score);
				}
				
			}return "Player 1 HIT!\n";
		} else {
			System.out.println("P1 - MISS @ " + guess);
			for (int i = 0; i < board2.length;i++) {
				if (board2[i].equals(guess)) {
					board2[i] = "MISS";
				}
			}
		}	return "Player 1 MISS!\n";	
			
	}
	

	public static String updateBoard2(String a) {
		String guess = a;
			
			if (ships1.contains(guess)) {
				System.out.println("P2 - Hit @ " + guess);
				for (int i = 0; i < board1.length;i++) {
					if (board1[i].equals(guess)) {
						board1[i] = "HIT";
						player2Score = player2Score + 1;
						System.out.println("Player 2 Score" + player2Score);
					}
					
				}return "Player 2 HIT!\n";
			} else {
				System.out.println("P2 - MISS @ " + guess);
				for (int i = 0; i < board1.length;i++) {
					if (board1[i].equals(guess)) {
						board1[i] = "MISS";
					}
				}
			}return "Player 2 MISS!\n";		
				
		}
}
