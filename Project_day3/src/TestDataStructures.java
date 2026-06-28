
public class TestDataStructures {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(5);
		list.add(7);
		
		list.insert(2,25);
		list.insert(0, 9);
		
		list.remove(3);
		
		
		list.print();
		

	}

}
