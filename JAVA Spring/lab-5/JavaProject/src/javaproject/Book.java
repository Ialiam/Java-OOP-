package javaproject;


public class Book {
    private String bName="";
    private String bAuthor="";
    private String bID="";
    private String bType="";
    private int bCopy=0;
    
    public Book(){}
    public Book(String bName, String bID, String bAuthor, String bType, int bCopy){
    this.bName=bName;
    this.bAuthor=bAuthor;
    this.bID=bID;
    this.bType=bType;
    this.bCopy=bCopy;
    }
    
    public void addCopy(int num){
        this.bCopy+=num;
    }
    
    public void bookInfo(){
        System.out.println("Book details -");
        System.out.println("Book Name: " + this.bName + "\n" +
                "Book id: " + this.bID + "\n" + "Book Author: " + this.bAuthor + "\n" + "Book Type: " +
                this.bType + "\n" + "Total copy" + this.bCopy);
    }
    
    
    
    
}

