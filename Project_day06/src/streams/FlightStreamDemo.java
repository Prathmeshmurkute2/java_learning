package streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightStreamDemo {

	public static void main(String[] args) throws Exception {
		
		Stream<String> lines = Files.lines(Paths.get("src/flight.txt"));
		
		List<Flight>flights = lines.map(line -> {
			String[] record = line.split(",");
			return new Flight(Integer.parseInt(record[0]), record[1], record[2], record[3]);
			
		}).collect(Collectors.toList());
		
		//flights.forEach(System.out::println);
		
		//prints details of flight no 123
		 System.out.println(flights.stream().filter(n -> n.getCode()==123).findFirst().get());
		
		//print all flights by jet carrier
		
		//print flight going to delhi
		
		//Remove a flight no 920
		 
		 System.out.println("\nJet Flights:");
		    flights.stream()
		           .filter(f -> f.getCarrier().equals("Jet"))
		           .forEach(System.out::println);

		    System.out.println("\nFlights Going to Delhi:");
		    flights.stream()
		           .filter(f -> f.getDestination().equals("Delhi"))
		           .forEach(System.out::println);

		    flights.removeIf(f -> f.getCode() == 920);

		    System.out.println("\nAfter Removing Flight 920:");
		    flights.forEach(System.out::println);

	}

}
