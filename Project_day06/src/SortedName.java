import java.util.Comparator;
import java.util.TreeSet;


public class SortedName {

	public SortedName() {
	}
	
	public static void main(String[] args) {
		//Comparator<Person> ageComp = (p1, p2) -> p1.getAge() - p2.getAge();
		
		Comparator<Person> nameComp = (p1, p2) -> p1.getName().compareTo(p2.getName());
		
		TreeSet<Person> people = new TreeSet<Person>();
		
		people.add(new Person("prathmesh",21));
		people.add(new Person("Robert",25));
		people.add(new Person("sham",29));
		
		people.forEach(System.out::println);
		
	}

}
