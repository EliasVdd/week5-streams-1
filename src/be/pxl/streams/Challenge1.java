package be.pxl.streams;

import java.util.Arrays;
import java.util.List;

public class Challenge1 {
	public static void main(String[] args) {
		List<String> tombolaNummers = Arrays.asList("A12", "a20", "B120", "b72", "d53", "D42", "d50", "F12");
		// print alle tombolanummers die starten met D (of d) gesorteerd, steeds met de eerste letter in uppercase
		// Gewenste output: D42 D50 D53 
		tombolaNummers.stream().filter(d -> d.contains("D") || d.contains("d")).forEach(d -> System.out.println(d.substring(0,1).toUpperCase() + d.substring(1)));

	}
}
