package it.betacom.echo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FifthExercise {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7);
		List<Integer> sublist = list.stream()
				.filter(i -> (i % 2 == 0))
				.collect(Collectors.toList());
		
		sublist.forEach(System.out::println);

	}
}
