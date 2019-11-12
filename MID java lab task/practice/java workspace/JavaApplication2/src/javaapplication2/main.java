/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Ashfaq Afzal Chowdhury
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Student student = new Student();
//        student.setName("Ashfaq");
//        student.setId("17-35800-3");
//        student.setCGPA(2.00);
//        
//        System.out.println(student.getName());
//        System.out.println(student.getId());
//        System.out.println(student.getCGPA());
//        
//        Triangle t = new Triangle(10, 15, 8);
//        t.showInfo();
//        t.testTriangle();
        
        Account a1 = new Account("Fahim", "17-3500-3", 1000);
        Account a2 = new Account("Nabil", "17-3500-3", 1500);
        
        ///c1.deposite(1000);
       System.out.println("A/C Info:");
       a1.showInfo();
       System.out.println("Depositing: ");
       a1.deposit(500);
       
       System.out.println("A/C Info: ");
       a1.showInfo();
       a1.withdraw(200);
       a1.showInfo();
       
       
       a2.showInfo();
       a1.transfer(500, a2);
//        c1.deposite(1000);
//        c1.withdraw(500);
      
        
        
    }
    
}
