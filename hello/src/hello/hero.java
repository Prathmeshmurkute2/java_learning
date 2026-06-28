package hello;

interface Holder {
	void viewQuote();
}

interface Broker extends Holder{
	void getQuote();
}

interface Exchange extends Broker {
	void setQuote();
}

public class hero implements Exchange {
	@Override
	public void viewQuote() {
		System.out.println("view Quote");
	}
	
	@Override
	public void getQuote() {
		System.out.println("get Quote");
	}
	
	@Override
	public void setQuote() {
		System.out.println("set Quote");
	}
};



//public class hero {
//
//	public static void main(String[] args) {
//		
//		System.out.println("hello prathmesh");
//		
//		
//	}
//
//}
