/* 
* The Mr.Coxall Stack Program
*
* @author  Liam Fletcher
* @version 1.0
* @since   2021-12-10
*/

// Import the ArrayList class
import java.util.ArrayList;

public class MrCoxallStackV4 {
    
  // Creates arraylist that will act as a stack
  private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

  // Method for adding inputs to list
  public void push(int receivedNum) {
    stackAsArray.add(receivedNum);
  }

  /**
   * pop method to return top number on stack and remove it.
   */

  public int pop() {
    if (this.stackAsArray.size() == 0) {
      throw null;
    } else {
      int poppedNumber = this.stackAsArray.get(stackAsArray.size() - 1);
      stackAsArray.remove(stackAsArray.size() - 1);
      return poppedNumber;
    }
  }

  /**
   * peek method to observe top number on stack without removing it.
   */
  public int peek() {
    if (this.stackAsArray.size() == 0) {
      throw null;
    } else {
      int peekNumber = this.stackAsArray.get(stackAsArray.size() - 1);
      return peekNumber;
    }
  }

  /**
   * Clears the stack of all values when called.
   */
  public String clearer() {
    stackAsArray.clear();
    String arrayClearCommand = "Array cleared Successfully! ";
    return arrayClearCommand;
  }


  /**
   * Getter that tells the user all values in the stack.
   */

  public String currentStack() {
    String arrayVal = "Current ArrayList: ";
    for (int counter = 0; counter < stackAsArray.size(); counter++) {
      arrayVal = arrayVal + stackAsArray.get(counter) + ", ";
    }
    return arrayVal;
  }
}
