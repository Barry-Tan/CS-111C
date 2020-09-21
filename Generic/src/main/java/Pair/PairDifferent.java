package Pair;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class PairDifferent<T,S> {
    
    private T item1;
    private S item2;
    
    public PairDifferent(T item1, S item2){
        this.item1 = item1;
        this.item2=item2;
    }
    
    public T getItem1(){
        return item1;
    }
    
    public S getItem2(){
        return item2;
    }
    
    public void setItem1(){
        this.item1 =item1;
    }
    public void setItem2(){
        this.item2=item2;
    }
    
    @Override
    public String toString(){
        return item1.toString() + "\t" + item2.toString();
    }
    
    public boolean samItems(){
        return item1.equals(item2);
    }
}
