
public class Person implements Comparable<Person> {

	private String firstName, lastName;
	private int id;
	
	public Person(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " (" + id + ")";
	}
        
        @Override
        public int compareTo( Person other){
            int lastNameComparison = this.lastName.toUpperCase().compareTo(other.lastName.toUpperCase());
            
            if(lastNameComparison==0){
                int firstNameComparison = this.firstName.toUpperCase().compareTo(other.firstName.toUpperCase());
                if(firstNameComparison==0){
                    return Integer.compare(this.id,other.id);
                }else{
                    return firstNameComparison;
                }
            }else{
                return lastNameComparison;
            }
        }
        
        
	
	
}
