import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    Calculator calculator = new Calculator();

    boolean run = true;
    while (run) {
      System.out.println("Please enter a commend: ");
      String userInput = myObj.nextLine();  // Read user input
      String[] commends = userInput.split(" ");
      if (commends[0].equals("add")) {
        int a = Integer.parseInt(commends[1]);
        int b = Integer.parseInt(commends[2]);
        int result = calculator.add(a, b);
        System.out.println(result);
      } else if (commends[0].equals("subtract")) {
        int a = Integer.parseInt(commends[1]);
        int b = Integer.parseInt(commends[2]);
        int result = calculator.subtract(a, b);
        System.out.println(result);
      } else if (commends[0].equals("multiply")) {
        int a = Integer.parseInt(commends[1]);
        int b = Integer.parseInt(commends[2]);
        int result = calculator.multiply(a, b);
        System.out.println(result);
      } else if (commends[0].equals("divide")) {
        int a = Integer.parseInt(commends[1]);
        int b = Integer.parseInt(commends[2]);
        int result = calculator.divide(a, b);
        System.out.println(result);
      } else if (commends[0].equals("fib")) {
        int a = Integer.parseInt(commends[1]);
        int result = calculator.fibonacciNumberFinder(a);
        System.out.println(result);
      } else if (commends[0].equals("intToBinary")) {
        int a = Integer.parseInt(commends[1]);
        String result = calculator.intToBinaryNumber(a);
        System.out.println(result);
      } else if (commends[0].equals("exit")) {
        System.out.println("See you around");
        run = false;
      } else {
        System.out.println("Invalid commend!");
      }
    }

  }

}
