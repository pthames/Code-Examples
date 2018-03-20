import java.util.*;
import java.io.*;
/**
 * The Converter class takes in a string and converts
 * the numbers 1-9 into text.
 * The data is then sent to the main class to be written to file
 * and displayed on screen. 
 * 
 * 
 * @author (Phillip Thames) 
 * @version (06/07/2015)
 */
public class Converter
{
    private String line;
    private StringBuilder convertedline;
   

    /**
     * This default constructor sets the initial value of the string to unknown.
     */
    public Converter()
    {
        line = new String("unknown");
        
    }

    /**
     * This converter method performs all the actions of converting the sentence.
     * 
     * @param  line   This string is read in, saved, then converted and saved as a new string.
     * 
     */
    public void Converter(String line)
    {
       this.line = line;
       StringBuilder b = new StringBuilder(line); // creates a new string builder form the original string
       for(int i = 0; i< b.length();i++)// controlled loop to perform actions
       { 
           if(Character.isDigit(b.charAt(i))) //looks for digits within the string
           {   
                           
                   
               if('0' == b.charAt(i)){  //rplaces the char '0' with the text zero.
                   b.replace(i, i+1," zero ");}
               
                if('1' == b.charAt(i)){
                   b.replace(i, i+1," one ");}
                   
                    if('2' == b.charAt(i)){
                   b.replace(i, i+1," two ");}
               
               if('3' == b.charAt(i)){
                   b.replace(i, i+1," three ");}
                   
                    if('4' == b.charAt(i)){
                   b.replace(i, i+1," four ");}
               
                if('5' == b.charAt(i)){
                   b.replace(i, i+1," five ");}
                   
                     if('6' == b.charAt(i)){
                   b.replace(i, i+1," six ");}
               
               if('7' == b.charAt(i)){
                   b.replace(i, i+1," seven ");}
                   
                    if('8' == b.charAt(i)){
                   b.replace(i, i+1," eight ");}
               
               if('9' == b.charAt(i)){
                   b.replace(i, i+1," nine ");}
                   
             
            }
        
           convertedline = b;
        }
       
       
    }
    /**This toString method sends back the data to be written to file and displayed.
     * 
     * @ return str  This returned string is written to file and displayed on screen.
     */
   
    
    public String toString()
    {
        String str = "Input Record:\n\t"+line+"\n"
        +"Output Record:\n\t"+convertedline+"\n\n";
        
       
       
        return str;
    }
}
