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
public class Student{
    
    private String stuName = "";
    private Department dept; 
    
    public Student(){}
    public Student(String stuName, Department dept)
    {
        this.stuName = stuName;
        this.dept = dept;
    }

    
    public String getStuName()
    {
        return stuName;
    }
    
    
    public void showStudentInfo()
    {
        System.out.println("Student's Name : " + getStuName());
        System.out.println("Dept Name : " + dept.getDeptName()); 
    }
    
    public void setDepartment(Department dept)
    {
        this.dept = dept;
    }
    
    
    public void changeDepartment(Department dept)
    {
        this.dept = dept;
    }
    
    public void semesterFee(int totalCredit)
    {
      
        dept.calculateSemesterFee(totalCredit);
    }

  
    
}
