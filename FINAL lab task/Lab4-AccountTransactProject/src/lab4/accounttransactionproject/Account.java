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
public class Account {
 
    /*Properties / Members Variables*/
    private String accName;
    private String acId;
    private double accBalance;
    private Transaction[] listOfTransaction; // M.V
    private int totalNumberOfTransaction; // M.V
        
    /*Contructor*/
    public Account(){}
    public Account(String name, String ac, double b){
    this.accName = name;
    this.acId = ac;
    this.accBalance = b;
    this.listOfTransaction = new Transaction[100]; //creating an array of 100 elements
    }
    
    /*Methods*/
    public void deposit(double amount){
    this.accBalance = this.accBalance + amount;
    System.out.println("Deposited: "+ amount);
    //printMiniStatement();
    }
    
    public void withdraw(double amount){
    this.accBalance = this.accBalance - amount;
     System.out.println("Withdrawn: "+ amount);
    printMiniStatement();
    }
    
    public void transfer(double amount, Account receiver){
    System.out.println("\nTransfer request, amount: " + amount );
    receiver.deposit(amount);
    this.accBalance = this.accBalance - amount;
    //add this transaction
    addTransaction(this, receiver, amount);
    totalNumberOfTransaction++;
    }
    
    public String getAccNo(){
    return this.acId;
    }
    
    public void addTransaction(Account sender, Account receiver, double amount){
         // creating a transaction with passed info
         Transaction t = new Transaction(sender, receiver, amount,"");
         
         //now adding the above transaction 
         for(int i = 0; i <= listOfTransaction.length; i++){
              if(i == listOfTransaction.length){ //if array is full
              System.out.println("Message: listOfTransaction is full!, "
                      + "Transaction could not be saved!");    
               break;
               }
                else{
                    if(listOfTransaction[i] == null){
                    listOfTransaction[i] = t;
               System.out.println("Message: Transaction added successfully in "
                       +"["+i+"]");
                    break;
                    }
                }            
        }
         //end of adding transaction
    }
    
    void showAllTranscation(){
    System.out.println("\nList of Transactions: ");
        for(int i = 0; i < listOfTransaction.length; i++){
            if(listOfTransaction[i] != null){
            System.out.print((i+1)+".");
            listOfTransaction[i].showInfo();
            }
        }
        
    }
    
    public void printMiniStatement(){
    System.out.println();
    System.out.println("+-----------------------------+");
    System.out.println("|        MINI STATEMENT       |");
    System.out.println("+-----------------------------+");
    System.out.println("A/C Name:" + this.accName);
    System.out.println("A/C No:" + this.acId);
    System.out.println("A/C Balance:" + this.accBalance);
    System.out.println("Total no. of Transactions:" + this.totalNumberOfTransaction);
    }
}
