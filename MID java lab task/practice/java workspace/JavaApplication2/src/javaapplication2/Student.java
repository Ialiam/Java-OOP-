/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

public class Student {
    
    private String name;
    private String id;
    private double cgpa;
    
    public 
            Student(){};
            void setName(String name)
            {
                this.name = name;
            }
            
            void setId(String id)
            {
                this.id = id;
            }
            
            void setCGPA(double cgpa)
            {
                this.cgpa = cgpa;
            }
            
            String getName()
            {
                return name;
            }
            
            String getId()
            {
                return id;
            }
            
            double getCGPA()
            {
                return cgpa;
            }
    
    
}
