
/**
 * Pet Class
 * The Pet class has all of the fields for each pet.
 * The data is sent from main after being read from a file.
 * Then all of the pet fields are set to those values sent from main.
 * After each pet is created then it is printed to screen.
 * 
 * 
 * @author (Phillip Thames) 
 * @version (6/19/2015)
 */
public class Pet
{
    // here are all of my pet variables.
    private String petName, petType, wieght, vacDate, lastVisit;
    
    
    /**
     * Default Constructor for objects of class Pet
     * Initializes all of the pet strings to null.
     */
    public Pet()
    {
        petName= petType= wieght= vacDate= lastVisit = "null";
    }

    /**
     * Pet Constructor
     * Takes in the values for all the pet fields and sets them accordingly
     * 
     * @param   petName, petType, wieght, vacDate, lastVisit.
     * 
     */
    public Pet(String petName, String petType, String wieght, String vacDate, String lastVisit)
    {
        this.petName=petName;
        this.petType=petType;
        this.wieght=wieght;
        this.vacDate=vacDate;
        this.lastVisit=lastVisit;
    }
    
     /**
      * Pet toString method
      * 
      * returns all the pet data after each new pet is created.
      *  
      * @return str - string representation of all of the pet data.
      */
    public String toString()
    {
        String str = new String(         
        "Pet Info:\n"+petName+", "+petType+", "+wieght+"\n"+
        vacDate+", "+lastVisit+"\n");
        
        return str;
        
    }
}
