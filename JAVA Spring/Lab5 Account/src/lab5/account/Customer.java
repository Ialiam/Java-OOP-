/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.account;

/**
 *
 * @author student
 */
public class Customer {
    
    private String custNo = "";
    private String custName = "";
    private Account listofAccount[];
    
    
    public Customer(){}
    public Customer(String custNo, String custName)
    {
        this.custNo = custNo;
        this.custName = custName;
        listofAccount = new Account[5];
    }
    
    public void addAccount(Account a)
    {
       for(int i = 0; i < listofAccount.length; i++)
       {
           if(listofAccount[i] == null)
           {
               listofAccount[i] = a;
           }
       }
       
    }
    
    public void showInfo()
    {
        System.out.println("Customer Name " + this.custName);
        System.out.println("Customer ID " + this.custNo);
        
        for(int i = 0; i < listofAccount.length; i++)
    {
         if(listofAccount[i] != null)
           {
               listofAccount[i].showAccInfo();
           }
    }
    }
    
    
    
    
    
}



    

