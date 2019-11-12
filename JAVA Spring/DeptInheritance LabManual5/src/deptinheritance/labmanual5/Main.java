/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deptinheritance.labmanual5;

/**
 *
 * @author Ashfaq Afzal Chowdhury
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        


        CS cs = new CS();
        EEE eee = new EEE();
        BBA bba = new BBA();
        
        
        Student s = new Student("Zawad", eee);
        s.semesterFee(6);

        s.showStudentInfo();
   
    }

 
    
}
