package it.betacom.charlie;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThirdExercise {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Predicate<Integer> isMoreThan = i -> (i > 5);
		Predicate<Integer> isLessThan = i -> (i < 10);
		List<Integer> sublist = list.stream()
				.filter(isMoreThan.and(isLessThan))
				.collect(Collectors.toList());
		
		sublist.forEach(System.out::println);

	}
}
