
public class ShoppingCart {
	private Product[] items;
	private double total;
	private int idx;
	
	public ShoppingCart() {
		items = new Product[5];
	}
	
	public void addToCart(Product p) throws ShoppingCartException {
		if(idx == items.length)
			throw new ShoppingCartException("Your cart is full");
		else
			items[idx ++] = p;
			total += p.getPrice();
	}
	public void checkot() throws ShoppingCartException {
		if(idx == 0)
			throw new ShoppingCartException("Your cart is empty!");
		for(int i=0;i<idx;i++) {
			System.out.println(items[i]);
		}
	}
}
