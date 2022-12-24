package EXCEPTION;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        int customerID, orderQty;
        
        try{
            System.out.print("Enter customer ID: ");
            customerID = input.nextInt();

            System.out.print("Enter number of food: ");
            orderQty = input.nextInt();


            Thread waiterThread = new Thread(restaurant);
            Waiters waiter = new Waiters(customerID, orderQty);
            Thread restoThread = new Thread(waiter);
            
            waiterThread.start();
            restoThread.start();
            waiterThread.join();
            restoThread.join();
            

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }

    }
}