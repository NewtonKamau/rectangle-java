import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter the length of your rectangle:");
   // gets data from the user
    String stringLength = myConsole.readLine();
    // converts string to integers
    int intLength = Integer.parseInt(stringLength);
    System.out.println("Enter the width of your rectangle:");
    String stringWidth = myConsole.readLine();
    int intWidth = Integer.parseInt(stringWidth);
    // creates instance of our clss ;
    Rectangle rectangle = new Rectangle(intLength, intWidth);
    // calls the square method
    boolean squareResult = rectangle.isSquare();
    System.out.println("Is your rectangle a square, too? " + squareResult + "!");
  }
}