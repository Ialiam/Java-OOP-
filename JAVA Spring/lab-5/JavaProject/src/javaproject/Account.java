package javaproject;

public class Account {
   private String acName="";
   private String acId="";
   private double balance = 0;
   
   public Account(){System.out.println("Account has been created");}
   public Account(String acName, String acId, double balance){
       this.acName=acName;
       this.acId=acId;
       this.balance=balance;
       
       System.out.println("Account has been created on name " + this.acName);
  }
   
   public void transfer(double amount, Account rec){
       System.out.println("Balance transferred to " + rec.acName);
       this.balance-=amount;
       rec.balance+=amount;
       
   }
   
   public void deposit(double amount){this.balance+=amount;}
   
   public void withdraw(double amount){this.balance-=amount;}
   
   
}
