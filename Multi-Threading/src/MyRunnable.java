
public class MyRunnable implements Runnable{
	private int data;

	
	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
	
		for(int i=1;i<=50;i++) {
			System.out.println(tname + " : " + ++data);
		}
	}

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr,"First");
		Thread t2 = new Thread(mr,"Second");
		Thread t3 = new Thread(mr,"Third");
		
//		t2.setPriority(MAX_PRIORITY);
//		t3.setPriority(MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
//		Thread ct = Thread.currentThread();
//		String tname = ct.getName();
//		for(int i=0;i<=50; i++) {
//			System.out.println(tname + " : " + i);
//		}
	}

}
