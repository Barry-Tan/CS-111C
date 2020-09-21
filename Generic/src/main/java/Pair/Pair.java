package Pair;


public class Pair<T> {
    
    private T item1, item2;
    
    public Pair(T item1, T item2){
        this.item1 = item1;
        this.item2=item2;
    }
    
    public T getItem1(){
        return item1;
    }
    
    public T getItem2(){
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
       
    @Override
    public boolean equals(Object testedItem){
        if(testedItem instanceof Pair<?>){
            Pair<T> otherEqualPair = (Pair<T>) testedItem;

            if(this.item1.equals(otherEqualPair.item1)&&this.item2.equals(otherEqualPair.item2)){
                return true;}
            else if(this.item1.equals(otherEqualPair.item2)&&this.item2.equals(otherEqualPair.item1)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }   
    }
    
    public boolean sameItem(){
        return item1.equals(item2);
        //return item1==item2; INCORRECT! This test for aliases
    }
}
