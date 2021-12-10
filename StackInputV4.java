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
        Scanner scanClear = new Scanner(System.in);


        MrCoxallStackV4 clasStack = new MrCoxallStackV4();


        try {
            // accepts input 
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

                    // Pushes user input
                    clasStack.push(numberChosen);
                }

                System.out.println("Enter the amount of integers you wish to pop: ");
                int popNum = userInput.nextInt();

                if (popNum < 1) {
                    System.out.println("Invalid pop number assuming you want" +
                        " nothing popped...");
                } else {

                    for (int popCount = 0; popCount < popNum; popCount++) {

                        System.out.println("Popped Num: " + clasStack.pop());
                    }
                }

                System.out.println();
                System.out.println("Peeked Num: " + clasStack.peek());


                System.out.println();
                System.out.println("Would you like to clear the stack? (Yes/No) ");
                String clearInputLow = scanClear.nextLine();


                String clearInput = clearInputLow.toUpperCase();


                if (clearInput.equals("YES")) {
                    System.out.println();

                    System.out.println(clasStack.clearer());

                } else if (clearInput.equals("NO")) {
                    System.out.println();
                    System.out.println("Answer acknowledged, continuing ...");

                } else {
                    System.out.println();
                    System.out.println("Invalid input, presuming you dont want to " +
                        "clear");
                }


                System.out.println();
                System.out.println(clasStack.currentStack());
            }

        } catch (NullPointerException e) {
            System.out.println("Invalid Input. More numbers Popped than in stack");

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}
