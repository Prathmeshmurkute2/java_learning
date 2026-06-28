
public class SubDemo<P, T> extends Demo<T> {
	private P temp;
	
	public SubDemo(T data, P temp) {
		super(data);
		this.temp = temp;
	}
	
	public P getTemp() {
		return temp;
	}
	
	public void setTemp(P temp) {
		this.temp = temp;
	}
	
	public static void main(String[] args) {
		SubDemo< Integer, String> sd = new SubDemo<Integer, String>("Mona", 99);
		System.out.println(sd.getData() + "\t" + sd.getTemp());
	}
}
