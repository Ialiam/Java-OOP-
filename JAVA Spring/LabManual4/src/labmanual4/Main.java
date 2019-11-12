/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmanual4;

/**
 *
 * @author Ashfaq Afzal Chowdhury
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Account acc1 = new Account("Malenda","112345",50000);
      Account acc2 = new Account("Bill","101112",90000);
      acc1.withdraw(2000);
      acc1.deposit(5000);
      acc1.transfer(acc2, 5000);

      acc2.deposit(4000);
      acc2.withdraw(1000);
      acc2.transfer(acc1,10000);
      acc1.showAllTransaction();
      acc2.showAllTransaction();
    }
        
  }
    
