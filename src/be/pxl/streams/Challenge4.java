package be.pxl.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import be.pxl.streams.Person.Gender;

public class Challenge4 {
	public static void main(String[] args) {
		List<Person> personen = Arrays.asList(
				new Person("Sofie", 23, Gender.FEMALE),
				new Person("Adam", 31, Gender.MALE), 
				new Person("Bastiaan", 25, Gender.MALE),
				new Person("Berend", 22, Gender.MALE), 
				new Person("Aagje", 27, Gender.FEMALE)
		);
		// 1. Geef de gemiddelde leeftijd van alle personen
		// Verwachte output:  Gemiddelde leeftijd: 25.6
		//OptionalDouble sum = personen.stream().mapToInt(Person::getAge).average();

		//System.out.println(sum);

		// 2. Hoeveel mannen staan er in de lijst
		// Verwachte output: Aantal mannen: 3
		//long count = personen.stream().filter(p-> p.getGender().equals(Gender.MALE)).count();
		//System.out.println(count);

		// 3. Hoeveel mannen ouder dan 24 staan er in de lijst
		// Verwachte output: Aantal mannen boven 24: 2
		//long count = personen.stream().filter(p -> p.getAge() > 24 && p.getGender().equals(Gender.MALE)).count();
		//System.out.println(count);
		// 4. Geef de gemiddelde leeftijd van alle mannen
		// Gemiddelde leeftijd mannen: 26.0
		//OptionalDouble average = personen.stream().filter(p -> p.getGender().equals(Gender.MALE)).mapToInt(Person::getAge).average();
		//System.out.println(average);

		// 5. Maak een nieuwe persoon met als naam de eerste letter van iedere persoon in de lijst
		// en als leeftijd de som van alle leeftijden
		// Maak gebruik van de methode .reduce()
		Person newPerson = personen.stream().reduce(new Person("", 0, Gender.MALE), (p1, p2) -> {
			p1.setAge(p1.getAge() + p2.getAge());
			p1.setName(p1.getName() + p2.getName().substring(0, 1));
			return p1;
		});

		System.out.println(newPerson.getName());

	}
}
