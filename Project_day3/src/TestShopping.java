
public class TestShopping {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		try {
			cart.addToCart(new Product("Marker",25));
			cart.addToCart(new Product("Duster", 75));
			cart.addToCart(new Product())
		}
	}

}
