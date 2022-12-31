package praktikum;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    boolean redo = true;
    Scanner scanner = new Scanner(System.in);
    Calculation calculation = new Calculation();

    do {
      try {
        System.out.println("\n==Menu Program==");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
        System.out.print("Select menu : ");
        int menu = scanner.nextInt();

        switch (menu) {
          case 1:
            System.out.print("\nEnter the length of the side of the square : ");
            double s = scanner.nextDouble();
            calculation.setSquare(s);
            calculation.run();
            System.out.println("\nThe calculation result: " + calculation.getSquare());
            break;
          case 2:
            System.out.print("\nEnter the radius of the circle : ");
            double r = scanner.nextDouble();
            calculation.setCircle(r);
            calculation.run();
            System.out.println("\nThe calculation result: " + calculation.getCircle());
            break;
          case 3:
            System.out.print("\nInsert the side of the base of the trapezoid : ");
            double a = scanner.nextDouble();
            System.out.print("Enter the upper side of the trapezoid : ");
            double b = scanner.nextDouble();
            System.out.print("Enter the height of the trapezoid : ");
            double h = scanner.nextDouble();
            calculation.setTrapezoid(a, b, h);
            calculation.run();
            System.out.println("\nThe calculation result: " + calculation.getTrapezoid());
            break;
          default:
            System.out.println("\nOption not available");
            continue;
        }
        redo = false;
      } 
      
      catch (InputMismatchException e) {
        System.out.println("\n====Error: Input must be a number====\n");
        scanner.next();
      } 
      
      catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    } 
    
    while (redo);
    scanner.close();
  }

}
