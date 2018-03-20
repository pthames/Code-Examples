/** Phillip Thames, 2/28/2015, ITCS 2215-003
 * Programming Assignment #1
 * Towers of Hanoi Recursion 
 */
 

import java.util.*;
import java.util.Scanner;

// One class to hold the program
public class Towers 
{
       
        
    // Towers method accepts 4 integers, n to represent the number of disks used
    // The other three represent the pegs.
    public static void Towers(int n,int p1, int p2, int p3)
    {

        if(n>0){
            //first recursive call
       Towers(n-1, p1,p3,p2);  
       int x = peg[p1].pop();
      peg[p3].push(x);
      System.out.printf("%s",peg[1]+"\n");
      System.out.printf("%s",peg[2]+"\n");
      System.out.printf("%s",peg[3]+"\n");
      System.out.println("*************************"); 
      //second recursive call
      Towers(n-1,p2,p1,p3);
      
      
       
     }  
        
    }
    //Creates 4 stacks 0 through 3 and 0 is not used
    public static Stack<Integer>[] peg = new Stack[4];  

      
     public static void main(String[] args)
    {
                
        //Calls getDisks method
       int disks = getDisks();
       //intialize stacks to use as the pegs
       peg[1] = new Stack<Integer>();
       peg[2] = new Stack<Integer>();
       peg[3] = new Stack<Integer>();
       //Fills Stack #1 with the disks to start the game
       for(int j=disks; j>0; j--){
           peg[1].push(j);
        }
       System.out.printf("%s",peg[1]+"\n");
      System.out.printf("%s",peg[2]+"\n");
      System.out.printf("%s",peg[3]+"\n");
      System.out.println("*************************"); 
      //Calls the Towers method and sends over disks and integers to represent Stacks
       Towers(disks,1, 2, 3);
  
    }
    
    //getDisk method returns number of disks
    public static int getDisks()
    {
      Scanner input = new Scanner(System.in);
       System.out.println("How many disks would you like to play with?");
       int d = input.nextInt(); 
        while (d<2 || d>8)
       {
           System.out.println("Please choose a number from 2 to 8 please.");
           int x = input.nextInt(); 
           d=x;
        }
        
        return d;
    }
    
    
}
