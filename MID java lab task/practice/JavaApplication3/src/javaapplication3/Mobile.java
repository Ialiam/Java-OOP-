/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author aacfahim
 */
public class Mobile {
    
    private
            String mobileOwnerName;
            String mobileNumber; // SIM number
            String mobileBalance;
            String mobileOSName;
            boolean lock; // true means phone is lock false means unlock
    
    public
            Mobile() {}
            Mobile(String user, String mobNum, String balance, String OS, boolean status)
            {
                this.mobileOwnerName = user;
                this.mobileNumber = mobNum;
                //this.mobileBalance = balance;
                this.mobileOSName = OS;
                this.lock = status;
                int x = Integer.parseInt(balance);
                this.mobileBalance = balance;
            }
            
            void showInfo()
            {
                
                if(this.lock == false)
                {
                    System.out.println("---------------------------------------");
                    System.out.println("Mobile Owner name: " + this.mobileOwnerName);
                    System.out.println("Mobile Number: +88" + this.mobileNumber);
                    int x = Integer.parseInt(this.mobileBalance); //test
                    System.out.println("Mobile Balance: " + x + " taka");
                    System.out.println("Mobile's current OS version: " + this.mobileOSName);
                }
                else
                     System.out.println("The phone is Locked");   
                
                
            }
            
            void callSomeone(int timeDuration)
            {
                if(this.lock == false)
                {
                    int x = Integer.parseInt(this.mobileBalance);
                    x = x - timeDuration;
                    System.out.println("balance# " + x);
                }
                
                else
                    System.out.println("You need to unlock before making a call");
         }
            
            void recharge(int amount)
            {
               if(this.lock == false)
               {
                   int x = Integer.parseInt(this.mobileBalance);
                   x = amount + x;
                   System.out.println("balance# " + x);
               }
               else
                    System.out.println("You can't recharge without unlocking");
            }
            
            
    
}
