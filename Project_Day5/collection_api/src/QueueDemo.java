import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<String>();
		
		que.offer("Apple");
		que.offer("Banana");
		que.offer("Cherry");
		
		System.out.println(que.peek()); // Fetch value but doesn't remove
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());// Fetch value and remove from queue
			
		}
		
		//write code to implement DeQueue in this example
		System.out.println("----------------------------------------");
		Deque<String> dq = new LinkedList<String>();
		
		dq.add("Alpha");
		dq.add("Beta");
		dq.add("Gama");
		
		while(!dq.isEmpty()) {
			System.out.println(dq.pollLast());
		}
		
		
		
		

	}

}
