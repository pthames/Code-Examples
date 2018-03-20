
/**
 * Write a description of class Client here.
 * In this Client Class, information from main will create clients
 * based on file input. Also, each client will have an array of pets.
 * The clients information will consist of a last name, first name, address
 * client ID, number of visits, an outstanding balance, and number of pets.
 * 
 * @author (Phillip Thames) 
 * @version (6/19/2015)
 */
public class Client
{       
    
    //Here are all of my Client variables
    //along with an array of pets as a field
        private String lastName;  
        private String firstName;
        private String address;
        private String clientID;
        private double visits;
        private double balance;
        private int m;//m is the number of pets
        private Pet[] petInfo;
       
        

    /**
     *Default Constructor for objects of class Client
     *This constructor initializes all of the variables
     *to null or zero.
     * 
     */
    public Client()
    {
       lastName = firstName = address = clientID = "null";
       visits = 0.0;
       m = 0;
       balance = 0.0;
        
        
    }

    /**
     * The Client Constructor takes in values from main for all of the fields
     * and sets those fields for each incoming client.
     * 
     * @param  lastName, firstName, address, clientID, visits, balance , m(The number of pets).
     *    
     *    The length of the pet array is set here.
     */
    public  Client(String lastName, String firstName,
    String address, String clientID, double visits, double balance, int m)
    {
        
        //incoming client data is set to the fields and a new pet array is created.
       this.lastName = lastName;
       this.firstName = firstName;
       this.address = address;
       this.clientID = clientID;
       this.visits = visits;
       this.balance = balance;
       this.m = m;
         Pet[] petInfo = new Pet[m];
        
        
    }
    
    
      /**
       * This equals method compares two clients and returns a boolean.
       * 
       * @ param inClient -the client being compared to this client.
       * @ return boolean - true if the clients are equal and false otherwise.
       */
    public boolean equals(Client inClient)
    {
        return this.clientID.equals(inClient.clientID);
    }
    
     /**
      * The toString method returns a string composed of all the client's data
      * @ return str - the string of client data.
      */
    public String toString()
    {
        String str = new String(
         "Client Info:\n" +lastName+", "+firstName+", "+address+", "+clientID+"\n"+
        "Balance due: "+balance+"\n");
       
        return str;
        
        
    }
    
    
    
}
