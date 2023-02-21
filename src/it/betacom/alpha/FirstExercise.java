package it.betacom.alpha;

import java.util.function.Predicate;

public class FirstExercise {
	public static void main(String[] args) {
		String name = "Andrea";

		Predicate<String> contains = string -> string.contains("a") || string.contains("A");
		Predicate<String> hasMoreThan = string -> string.length() > 10;

		System.out.println("Name: " + name);
		System.out.print("Does it have more than 10 letters or contain the letter 'A'? ");
		
		if (contains.or(hasMoreThan).test(name)) {
			System.out.println("Yes, it does!");
		} else {
			System.out.println("No, it doesn't!");
		}
	}
}
