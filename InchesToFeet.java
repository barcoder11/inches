import java.util.Scanner;
/**
 * User can type the number of inches and the progam will output the feet. 
 * @author Sangay Pemba
 * @since 09/20/25
 */

public class InchesToFeet {
    public static void main(String[] args ) {
        theInches(); // call the method that does the conversion
    }

     public static void theInches() {
       
        // create a scanner to store value of the user
        Scanner scanner = new Scanner(System.in);
       
        //Ask User for the nunber of inches
     System.out.println("Enter the number of inches:");
     int inches = scanner.nextInt();
     
    //Calculates
     int feet = inches / 12; // feet calculation
     int reMainder = inches % 12; // leftover
    
     System.out.println(inches + " inches is " + feet + " feet, and " + reMainder + " inches.");
   
     scanner.close();

    }

    
}
