import java.util.Scanner;

public class Main {
         public static void main(String[] args) {

                 System.out.println("Welcome to the calculator");
                 System.out.println("Enter a command:");

                 Scanner scanner = new Scanner(System.in);

                 Calculator calculator = new Calculator();

                 while (scanner.hasNext()) {
                         String commandString = scanner.next();

                         if (commandString.equals("add")) {
                                 int sum = calculator.add(scanner.nextInt(), scanner.nextInt());
                                 System.out.println(sum);
                         }

                         if (commandString.equals("subtract")) {
                                 int difference = calculator.subtract(scanner.nextInt(), scanner.nextInt());
                                 System.out.println(difference);
                         }

                         if (commandString.equals("multiply")) {
                                 int product = calculator.multiply(scanner.nextInt(), scanner.nextInt());
                                 System.out.println(product);
                         }

                         if (commandString.equals("divide")) {
                                 int quotient = calculator.divide(scanner.nextInt(), scanner.nextInt());
                                 System.out.println(quotient);
                         }

                         if (commandString.equals("fibonacci")) {
                                 int fib = calculator.fibonacciNumberFinder(scanner.nextInt());
                                 System.out.println(fib);
                         }

                         if (commandString.equals("binary")) {
                                 String binaryNumber = calculator.intToBinaryNumber(scanner.nextInt());
                                 System.out.println(binaryNumber);
                         }
                 }
         }
}