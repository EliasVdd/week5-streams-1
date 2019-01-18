package be.pxl.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Challenge3 {
	public static void main(String[] args) {
		List<String> topNames = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
		// 1. Druk alle namen van de lijst af in gesorteerde volgorde.
		// Zorg dat de eerste letter van een naam steeds met hoofdletter begint.
		//topNames.stream().sorted().forEach(d-> System.out.println(d.substring(0,1).toUpperCase() + d.substring(1)));
		
		// 2. Druk alle namen af die beginnen met A (of a)
		// Zorg dat de eerste letter van een naam steeds met hoofdletter begint.
		// Verwachte output: Amelia Ava
		//topNames.stream().filter(d -> d.substring(0,1).equals("A") || d.substring(0,1).equals("a")).forEach(System.out::println);
		
		// 3. Hoeveel namen beginnen er met A
		// Verwachte output: 2
		long max = topNames.stream().filter(d -> d.substring(0,1).equals("A")).count();

		System.out.println(max);
	}
}
