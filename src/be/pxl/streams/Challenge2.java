package be.pxl.streams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Challenge2 {
	public static void main(String[] args) {
		// maak een stream met 10 random gehele getallen tussen 0 en 30
		// bekijk hiervoor de methode ints(...) in de klasse Random
		// filter de getallen die deelbaar zijn door 3
		// en geef het maximum 
		// gebruik eventueel peek() om een tussenresultaat van de stream te tonen
		Random rand = new Random();
		IntStream stream = rand.ints(10, 0,30);

		stream.filter(d -> d%3 == 0).forEach(System.out::println);
		
	}
}
