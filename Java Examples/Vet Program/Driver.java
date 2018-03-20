import java. util.*;
import java.io.*;

/**
 * Driver Class.
 * The Driver holds my main method.
 * Main will read a file from a vet clinic.
 * Each line of client data will create a new client
 * with a last and first name, an address, an id, and the number of pets.
 * According to the number of pets, main will create an array of that many pets.
 * Then read in all of the pet data lines for each pet. A new pet will be created with each line of pet data read in.
 * Main will create a new client along with their pets until there is no more data in the file.
 * As the clients and pets are being created, they will print to screen.
 * 
 * 
 * @author (Phillip Thames) 
 * @version (6/19/2015)
 */
public class Driver
{
    public static void main(String[]args)throws IOException
    {
        Scanner input;//creates a new Scanner object.
        
        //Here are all of the variables necessary to hold the data
        //for the client fields and pet fields
       String lastName;
        String firstName;
        String address;
        String clientID;
         int m;//variable for the number of pets the client has.
        String petName;
        String petType;
        String wieght;
        String vacDate,lastVisit; 
        double visits;
        double balance;
        
        //String variables and StringTokenizer variables used in reading data from the file.
         String line1, line2;
        StringTokenizer stok, stok2;
        
        
       // counter variables used to mark the position of the 
       //pet and client arrays. 
       //these increment after each pet or client is created.
       //int k is for the clients and int p is for the pets.
        int k = 0;
        int p =0;
        
        
        //counter variables to start the intial size of each array
        //these variables increment each time a pet or client is created
        // int c is for the clients and int d is for the pets
         int d =1;
        int c =1;
       
      
       
        // a new scanner object is created along with a new file object.
        //the scanner named input reads the file
        input = new Scanner(new File("clientdata.txt"));
        
        
        // this while loop will perform its functions as long as the file has more data to read.
        while(input.hasNext())
        {
            //a new client array is created and set to the length of 1
            // after each client is created, c will incremenet by one.
             Client[] customer = new Client[c];
            
           
             //here the first line form the file is read into a string then
             //converted to a StringTokenizer
            line1 = input.nextLine();
            stok = new StringTokenizer(line1,",");
            
            //Here the first line of data is tokenized into seperate peices of data.
            //in order to be sent to the client constructor.
            lastName=stok.nextToken();
            firstName=stok.nextToken();
            address=stok.nextToken();
            clientID=stok.nextToken();
           visits= Double.parseDouble(stok.nextToken());
            balance= Double.parseDouble(stok.nextToken());
            m = Integer.parseInt(stok.nextToken());
            
            //all of the above data is sent to the client constructor and a new client is created
            customer[k] = new Client(lastName,firstName,address,clientID,visits,balance,m);
            
            //the client data is printed to screen
            System.out.println(customer[k]);
            
            //counter variables are incremented
             k++;
             c++;
                
            
            
            //depending on the number of pets the client has(m)
            //this loop will run m number of time to read the pet data from the file.
            for(int i=0;i<m;i++)
            {     
                // a new pet array is created
                  Pet[]petInfo = new Pet[d];
                  
                  //here is where each line of pet data is read from file
                  //then tokenized
                line2 = input.nextLine();
                stok2 = new StringTokenizer(line2,",");
                
                //Each line of pet data is tokenized into seperate data
                //in order to create a new pet.
                petName = stok2.nextToken();
                petType = stok2.nextToken();
                wieght = stok2.nextToken();
                vacDate = stok2.nextToken();
                lastVisit = stok2.nextToken();
               
                //all the pet data is sent to the pet constructor and a new pet is created.
                petInfo[p] = new Pet(petName, petType, wieght, vacDate, lastVisit);
                //pet data is printed to screen
                System.out.println(petInfo[p]);
                
                //counter variables for the pet are incremented
                 d++;                             
                p++;                    
            }
            
          
            
            
        }
           System.exit(0);//end main
    }
 
}
