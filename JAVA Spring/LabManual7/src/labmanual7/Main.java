/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmanual7;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author student
 */
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        
        CalculatorClass c = new CalculatorClass();
        
        while(true) {
            try {
                System.out.println("");
                System.out.println("Menu");
                System.out.println("1-Addition");
                System.out.println("2-Subtraction");
                System.out.println("3-Multiplication");
                System.out.println("4-Divison");
                System.out.print("Choose option: (1-4) OR Press0"
                        + " 0 to exit : ");
                Scanner scan = new Scanner(System.in);
                
                int choice = scan.nextInt();


                switch (choice) {
                    case 1: 
                        System.out.print("Input two numbers: ");
                        double x = scan.nextDouble();
                        double y = scan.nextDouble();
                                System.out.println("Sum = " + c.add(x, y));
                            break;  
                    case 2: 
                        System.out.print("Input two numbers: ");
                         x = scan.nextDouble();
                         y = scan.nextDouble();
                                System.out.println("Sub = " + c.sub(x, y));
                        break;
                    case 3: 
                        System.out.print("Input two numbers: ");
                         x = scan.nextDouble();
                         y = scan.nextDouble();
                                System.out.println("Product = " + c.mul(x, y));
                        break;
                    case 4: 
                        System.out.print("Input two numbers: ");
                         x = scan.nextDouble();
                         y = scan.nextDouble();
                                System.out.println("Division = " + c.div(x, y));
                        break;
                    case 0: 
                        System.out.println("Exiting Calculator...");
                         System.exit(0);
                }
            } catch (Exception e) {
               System.out.println("Wrong input! Try again.");
            }
        } 
    } 
}