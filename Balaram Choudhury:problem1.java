
 import java.util.Scanner;

public class Calculator {
  private double a;
  private double b;
  private String operation;

  public Calculator(double a, double b, String operation) {
    this.a = a;
    this.b = b;
    this.operation = operation;
  }

  public double calculate() {
    switch (operation.toLowerCase()) {
      case "addition":
        return a + b;
      case "subtraction":
        return a - b;
      case "multiplication":
        return a * b;
      case "division":
        if (b != 0) {
          return a / b;
        } else {
          throw new ArithmeticException("Cannot divide by 0");
        }
      default:
        throw new IllegalArgumentException("Invalid operation: " + operation);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number (a): ");
    double a = sc.nextDouble();

    System.out.print("Enter second number (b): ");
    double b = sc.nextDouble();

    System.out.print("Enter operation (addition/subtraction/multiplication/division): ");
    String operation = sc.next();

    Calculator cal = new Calculator(a, b, operation);

    try {
      double result = cal.calculate();
      System.out.println("Result: " + result);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

    sc.close();
  }
}     
       
      
      
     
