import java.util.*;
import java.io.*;
/**
 * This Driver class holds main.
 * Users will enter the name of the file they want converted.
 * The program will convert the numbers 1-9 within a sentence into text.
 * Output the original and converted sentences as well as write that same data to file.
 * 
 * @author (Phillip Thames) 
 * @version (06/07/2015)
 */
public class Driver
{

    /**
     * Here is the main method.
     * Calls all other method to perform actions
     */
    public static void main(String[]args) throws IOException
    {
        
        Scanner keyboard = new Scanner(System.in); //creats a new scanner object
        
        //user input
        System.out.println(
        "Enter the name of the file that you would like converted:\n");
        String filename = keyboard.nextLine();
        System.out.println(
        "Your converted sentences will be saved to a file,\n"+
        "What would you like that file name to be?\n");
        String outFile = keyboard.nextLine();
        PrintWriter pw = new PrintWriter(outFile);//creates a new printwriter so data can be written to file.
        
     
        //Validates the very existence of the said file.
        File file = new File(filename);
        if((!file.exists()))
        {
            System.out.println(
            "The file "+filename+" does not exist.");
            
            System.exit(0);
            
        }
        
        
        
        Scanner input = new Scanner(file);
        while(input.hasNext()) //runs the following code while the file has data.
        {
            String line = input.nextLine(); //reads the file one line at a time
            Converter cv = new Converter(); //creates a new Converter object
            cv.Converter(line); //sends the line of data to the converter.
            pw.println(cv.toString());   //writes lines of returned data to file    
            System.out.println(cv.toString());//outputs lines of returned data to screen.
        }
        
        System.out.println(
        "Your new file has been created and saved.");       
        
      
        input.close();  //Closing the scanner file
         pw.close();    //Closing the PrintWriter file.
    }
}
