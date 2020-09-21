package Pair;


import Pair.PairDifferent;
import Pair.Pair;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class PairTester {
    public static void main(String[] arg){
        Pair<Integer> numberPair = new Pair<Integer>(3,4);
        Pair<String> wordPair = new Pair<String>("hello","goodbye");
        
        System.out.print(numberPair);
        System.out.println(wordPair);
        
        String s1 = new String("apple");
        String s2 = new String("apple");
        Pair<String> wordPair2 = new Pair<String>(s1,s2);
        System.out.println("are they same?"+wordPair2.sameItem());
        
        PairDifferent<Integer,String> numberWoedPair = new PairDifferent<Integer,String> (5,"koo");
        PairDifferent<Integer,Integer> doubleNumberPair = new PairDifferent<Integer,Integer>(5,7);
        
        Pair<Integer> equalTester1 = new Pair<Integer>(3,6);
        Pair<Integer> equalTester2 = new Pair<Integer>(6,2);
        
        System.out.println("one & two are: "+equalTester1.equals(equalTester2));
    }
    
}
