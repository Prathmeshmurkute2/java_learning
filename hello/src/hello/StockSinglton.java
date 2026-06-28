package hello;

public class StockSinglton {
	private StockSinglton() {
		
	}
	
	private static hero stk;
	
	public static hero getStock() {
		if(stk == null)
			stk = new hero();
		return stk;
		
	}
}
