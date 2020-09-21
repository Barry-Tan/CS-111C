import java.util.*;


public class ClassExmaple {
    
    public static void main(String[] arg){
    
        ArrayList<String> rawList = new ArrayList<String>();// angel brakite on the right is optional
        rawList.add("Hello");
        
        //Since it define String as generic, it can not add object and int
        //rawList.add(Integer.valueOf(4));
        //rawList.add(new Student("Jessica","Bored",253));
        
        String firstItem = rawList.get(0);
        String secondItem = (String)rawList.get(2);// when cast with (String) without generic
    }
    
    public static void readUserNames(){
        Scanner scan = new Scanner(System.in);
        
        ArrayList<String> nameList = new ArrayList<String>();
        String userInputName = scan.nextLine();
        System.out.println("Enter names or quit to quit");
        
        while(userInputName !="quit"){
            nameList.add(userInputName);
            System.out.print("Enter a name or quit");
            userInputName = scan.nextLine();
        }
        
        Collections.sort(nameList);
        for(String name:nameList){
            System.out.println(name.toUpperCase());
        }
        
        
    }
    public static void readUserNumbers(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        
        System.out.println("How many numbers");
        int numberNumbers = Integer.parseInt(scan.nextLine());
        for(int i = 0;i<numberNumbers;i++){
            int userNumber = Integer.parseInt(scan.nextLine());
            numberList.add(userNumber);
        }
        
        int total = 0;
        for(Integer num:numberList){
            total+=num;
        }
        
       // double average = (total)/(numberList.size());
       //java will cut out numeric part, use *1.0 or use cast(double)
       double average2 = (total)/(double)(numberList.size());
       //OR
        double average = (total*1.0)/(numberList.size());
        System.out.println(average);
    }
}   
