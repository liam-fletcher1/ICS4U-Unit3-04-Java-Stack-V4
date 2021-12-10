/*
* The Mr. Coxall Stack Program
*
* @author  Liam Fletcher
* @version 1.0
* @since   2021-12-10
*/

// Import the Scanner class
import java.util.Scanner;

public class StackInputV4 {

  /**
  * This program recieves input and adds values onto our pseudo-stack.
  */

  public static void main(String[] args) {

    // create scanner object
    Scanner userInput = new Scanner(System.in);
    
    /* creating a second scanner object because for some reason the first
    * buggs out after being used in the clearinput section of the code.
    */
    
    Scanner scanClear = new Scanner(System.in);

    // references MrCoxallStack file 
    MrCoxallStackV4 clasStack = new MrCoxallStackV4();

    // ensures that user inputs only integer values
    try {
      // accepts input on how many integers program should accept
      System.out.println("Enter the amount of integers you wish to push: ");
      int stackNum = userInput.nextInt();
      
      // checks if inputs are valid
      if (stackNum < 1) {
        System.out.println("Invalid Input. Input only integers above 0");
      } else {
        for (int counter = 0; counter < stackNum; counter++) {

          // receive user input
          System.out.println("Enter an integer to push onto the stack ");
          int numberChosen = userInput.nextInt();
          System.out.println();

          // Pushes user input into arraylist in MrCoxallStack 
          clasStack.push(numberChosen);
        }

        // finds amount of numbers user wishes to pop
        System.out.println("Enter the amount of integers you wish to pop: ");
        int popNum = userInput.nextInt();

        // checks if inputs are valid
        if (popNum < 1) {
          System.out.println("Invalid pop number assuming you want"
                             + " nothing popped...");
        } else {

          // executes popping popNum amount of times
          for (int popCount = 0; popCount < popNum; popCount++) {

            // pops top number in stack
            System.out.println("Popped Num: " + clasStack.pop());
          }
        }
        
        // peeking num
        System.out.println();
        System.out.println("Peeked Num: " + clasStack.peek());

        // allows user to clear if they choose
        System.out.println();
        System.out.println("Would you like to clear the stack? (Yes/No) ");
        String clearInputLow = scanClear.nextLine();
        
        // converts input to upper to prevent case based errors
        String clearInput = clearInputLow.toUpperCase();
        
        // checks if user wants to clear
        if (clearInput.equals("YES")) {
          System.out.println();
          // if they want to clear call clear method
          System.out.println(clasStack.clearer());
        // if they dont want to clear acknowledge their response
        } else if (clearInput.equals("NO")) {
          System.out.println();
          System.out.println("Answer acknowledged, continuing ...");
        // if they input something wrong, tell them
        } else {
          System.out.println();
          System.out.println("Invalid input, presuming you dont want to "
                             + "clear");
        }

        // states current values located in stack
        System.out.println();
        System.out.println(clasStack.currentStack());
      }
    // catch invalid errors. this one for if null is returned.
    } catch (NullPointerException e) {
      System.out.println("Invalid Input. More numbers Popped than in stack");
    // this one for general problems like bad user inputs
    } catch (Exception e) {
      System.out.println("Invalid Input");
    }
  }
}
