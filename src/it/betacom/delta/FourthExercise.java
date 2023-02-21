package it.betacom.delta;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class FourthExercise {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		ListIterator<Integer> iterator = list.listIterator();
		
		list.forEach(n -> {
			System.out.print(n + " ");
		});
		
		
		list.forEach(n -> {
			iterator.next();
			iterator.set(n * 3);
		});
		
		System.out.println();
		
		list.forEach(n -> {
			System.out.print(n + " ");
		});
	}
}
