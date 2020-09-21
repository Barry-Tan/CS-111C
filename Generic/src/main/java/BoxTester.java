

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
import java.util.*;
public class BoxTester {
    public static void main(String[] args){
        
        Box numbersBox = new Box(4);
        numbersBox.replaceContents(5);
        
        Box<Integer> numberBox = new Box<Integer>(Integer.valueOf(1));
        int contents = numberBox.getContents();
        numberBox.replaceContents(5);
        
        Box<String> wordBox1 = new Box<String>("hello"); 
        String wordCountents = wordBox1.getContents();
        wordBox1.replaceContents("bye");
        
        Box<String> wordBox2 = new Box<String>("hello");
        wordBox2.replaceContents("bye");
        
        System.out.println("equals boxes?"+wordBox1.equals(wordBox2));// true
        System.out.println("equals boxes?"+wordBox1.equals(numberBox));//false
        
        ArrayList<Box<Integer>> listofNumberBoxes = new ArrayList<Box<Integer>>();

    }
}
