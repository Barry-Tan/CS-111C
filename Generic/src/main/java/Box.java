



public class Box<T> {
    
    private T things;
    private int thingCounts;
    private T[] oldThings;
    
    public Box(T firstThing){
        this.things = firstThing;
        this.thingCounts = 1;
        
        oldThings = (T[])(new Object[5]); // allowed
        //oldthings =T[5];//not allow
    }
    
    public T getContents(){
        return things;
    }
    
    public int getOCount(){
        return thingCounts;
    }
    
    public void replaceContents(T  newThing){
        this.things = newThing;
        thingCounts++;
    }
    
    @Override
    public String toString(){
        return things.toString()+"(item"+thingCounts+")";
    }
    
    
    public boolean equal(Object other){
        if(other instanceof Box<?>){
            Box<?> otherBoxR = (Box<?>)other;
            boolean sameThing = this.things.equals(otherBoxR.things);
            boolean sameCount = this.thingCounts==otherBoxR.thingCounts;
            
            return sameThing && sameCount;
        }else{
            return false;
        }
    }
}
