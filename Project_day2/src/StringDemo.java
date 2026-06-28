
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		
		System.out.println(s1==s2);
		System.out.println(s1==s2);
				
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s1 = s1 + "World";
		System.out.println(s1);
		
		String name = "Prathmesh";
		String nameRegex = "[A-Z]{1}[a-z]{3,}";
		System.out.println(name.matches(nameRegex));
		
		String cell = "9322265466";
		String cellRgex = "[6-9][0-9]{9}";
		System.out.println(cell.matches(cellRgex));
		
		String email = "prathmesh@gmail.com";
		String emailRegex = "/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$/";
		System.out.println(cell.matches(emailRegex));


	}

}
