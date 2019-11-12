package javaproject;

public class Student {
    private String name = "";
    private String Id = "";
    private String departmnet = "";
    private double cgpa = 0;
    private Account stdAcc;
    private Library libAcc;
    
    public Student(){}
    
    public Student(String name, String Id, String department, double cgpa){
        this.name=name;
        this.Id=Id;
        this.departmnet=department;
        this.cgpa=cgpa;
    }
    
   public void payFine(){
       double x=this.libAcc.getTotalChagre();
       Account recieve=this.libAcc.getLibAcc();
       
       this.stdAcc.transfer(x, recieve);
   }
   
    public void showInfo(){
        System.out.println("Studnet details:");
        System.out.println("Name:" + this.name + "Id: " + this.Id + "Department: " + this.departmnet + "CGPA: " + this.cgpa);
    }
    
    
}
