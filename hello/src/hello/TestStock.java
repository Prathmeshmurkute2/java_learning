package hello;

public class TestStock {

	public static void main(String[] args) {
		
		Holder h = (Holder) StockSinglton.getStock();
		h.viewQuote();
		
		Broker b = (Broker) StockSinglton.getStock();
		b.getQuote();
		
		Exchange e = (Exchange) StockSinglton.getStock();
		e.setQuote();
		
		System.out.println(h == b);
		System.out.println(b == e);

	}

}
