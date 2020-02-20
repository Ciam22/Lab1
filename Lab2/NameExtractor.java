package nameextractor;

import java.util.Scanner;

/**
 * To extract the first name and the last name from a user input name. 
 * It will also remove all the unnecessary spaces, and convert the cases
 * 
 * @author Sufiyan Mohammad
 */
public class NameExtractor {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Please enter your name LAST name then your FIRST name: "); 
        String name = console.nextLine().trim();      
        
        int spaceIdx = name.indexOf(' ');             
        String lName = name.substring(0, spaceIdx);   
        String fName = name.substring(spaceIdx).trim();  
        
        fName = Character.toUpperCase(fName.charAt(0)) + 
                fName.substring(1).toLowerCase();           
        lName = Character.toUpperCase(lName.charAt(0)) + 
                lName.substring(1).toLowerCase();           
        
        System.out.printf("Name: %s\n", name);
        System.out.printf("First Name: %s\n", fName);
        System.out.printf("last Name: %s\n", lName);
    }
}