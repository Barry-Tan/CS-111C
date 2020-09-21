/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class Student {
    
    private String firstName, lastName;
    private int studentID;
    private static final int studentIDMaxmium = 9999;
    
    public Student(String firstName,String lastName, int studentID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getStudentID(){
        return studentID;
    }
    
    public void setFirstName(){
        this.firstName = firstName;
    }
    
    public void setLastName(){
        this.lastName = lastName;
    }
    
    public void setStudentID(){
        if(studentID>0 && studentID<studentIDMaxmium)
        {
            this.studentID = studentID;
        }
    }
    @Override
    public  String toString(){
        return lastName + ","+firstName+"(" + studentID + ")";
    }
    
    @Override
    public boolean equals(Object other){
        if(other instanceof Student){
            Student otherStudent = (Student) other;
            return this.studentID == otherStudent.studentID&&
                    this.firstName.equals(otherStudent.firstName)&&
                    this.lastName.equals(otherStudent.lastName);
        }else{
                return false;
        }
    
    }
    
    public void enroll(){
        System.out.println("Enrolling student" + studentID);
    }
    
    public void graduate(){
        System.out.println("Confirm credits before gradution for" + studentID);
    }
}
