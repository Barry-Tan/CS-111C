/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class ValidOutputItemTester {
    public static void main(String[] args){
        
        ValidOutputItem<String> stringItem = new ValidOutputItem<String>("a,b,c");
        System.out.println(stringItem);
        stringItem.setItem("abc123");
        System.out.println(stringItem);
                
        Student student = new Student("lala","bobo",1233);
        ValidOutputItem<Student> studentItem = new ValidOutputItem<Student>();
        studentItem.setItem(student);
        System.out.println(studentItem);
        
        ValidOutputItem<Integer> integerItem = new ValidOutputItem<Integer>();
        integerItem.setItem(5);
        System.out.println(integerItem);
        
    }
}
