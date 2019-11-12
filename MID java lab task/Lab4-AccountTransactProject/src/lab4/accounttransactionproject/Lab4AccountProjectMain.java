/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.accounttransactionproject;

/**
 *
 * @author Dr. Kamruddin Nur
 */
public class Lab4AccountProjectMain{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Account a1 = new Account("Mr. XYZ","1-123456-1", 1000);
        Account a2 = new Account("Mr. XYZ","1-123456-2", 2000);
        Account a3 = new Account("Mr. PQR","1-123456-2", 3000);
        
        a2.printMiniStatement();
        
        //a1.deposit(200);
        //a2.withdraw(100);
       
        a1.transfer(500,a2);
        a2.transfer(250,a1);
        a1.transfer(100,a2);
        a1.transfer(200,a2);
        a2.transfer(50,a2);
        
        a1.printMiniStatement();
        a1.showAllTranscation();
        
        a2.printMiniStatement();
        a2.showAllTranscation();
    }
    
}
