import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("Scott","tiger" );
		map.put("Jack","Jill" );
		map.put("polo","lili" );
		map.put("Jack","rose" );
		
		System.out.println("Scott: " + map.get("Scott"));
		System.out.println("Polo: " + map.get("polo"));
		System.out.println("Jack: " + map.get("Jack"));
		
		//print all keys and values without manually feeding keys
		System.out.println("--------------------------------------------");
		for(String key: map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("--------------------------------------------");
		map.forEach((key,value) -> System.out.println(key + " : "+ value));
		
	}

}
