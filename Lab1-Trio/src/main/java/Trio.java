import java.util.*;
public class Trio<T> {
    private T item1,item2,item3;
            
    public Trio(T item1){
        this.item1 = item1;
        this.item2= item1;
        this.item3 = item1;
        
    }
    
    public Trio(T item1,T item2,T item3){
        this(item1);
        this.item2 = item2;
        this.item3= item3;
    }
    
    public T getItem1(){
        return item1;
    }
    
    public T getItem2(){
        return item2;
    }
    
    public T getItem3(){
        return item3;
    }
    
    public void setItem1(T item1){
        this.item1 = item1;
    }
    
    public void setItem2(T item2){
        this.item2 = item2;
    }
    
    public void setItem3(T item3){
        this.item3 = item3;
    }
    
    public String toString(){
        return "First element: " + item1.toString()
                +"\nSecond element: " + item2.toString()
                +"\nThird element: " + item3.toString();
    }
    
    public void replaceAll(T newItem){
        this.item1 = newItem;
        this.item2 = newItem;
        this.item3 = newItem;
    }
    
    public boolean hasDuplicates(){
        if(item1.equals(item2)||item1.equals(item3)||item2.equals(item3)){
            return true;
        }else{
            return false;
        }
    }
    
    public int count(T countItem){
        int repeatedTime=0;
        ArrayList<T> thisList = new ArrayList<T>();
        thisList.add(item1);
        thisList.add(item2);
        thisList.add(item3);
        
        for(int i=0;i<3;i++){
            if(thisList.get(i).equals(countItem)){
                repeatedTime++;
            }               
        }
        return repeatedTime;
    }

    
    @Override
    public boolean equals(Object newTrio){
        if(newTrio instanceof Trio<?>){
            Trio<T> otherTrio = (Trio<T>) newTrio;
            boolean sameFirstOrder = this.item1.equals(otherTrio.item1)
                   && this.item2.equals(otherTrio.item2)
                   && this.item3.equals(otherTrio.item3);
            boolean sameSecondOrder = this.item1.equals(otherTrio.item1)
                    && this.item2.equals(otherTrio.item3)
                    && this.item3.equals(otherTrio.item2);
            boolean sameThirdOrder = this.item1.equals(otherTrio.item2)
                    && this.item2.equals(otherTrio.item1)
                    && this.item3.equals(otherTrio.item3);
            boolean sameFourthOrder = this.item1.equals(otherTrio.item2)
                    && this.item2.equals(otherTrio.item3)
                    && this.item3.equals(otherTrio.item1);
            boolean sameFifthOrder = this.item1.equals(otherTrio.item3)
                    && this.item2.equals(otherTrio.item2)
                    && this.item3.equals(otherTrio.item1);
            boolean sameSixthOrder = this.item1.equals(otherTrio.item3)
                    && this.item2.equals(otherTrio.item1)
                    && this.item3.equals(otherTrio.item2);
            return sameFirstOrder || sameSecondOrder || sameThirdOrder ||
                   sameFourthOrder || sameFifthOrder || sameSixthOrder;
                    
        }else{
            return false;
        }        
    }        
}
