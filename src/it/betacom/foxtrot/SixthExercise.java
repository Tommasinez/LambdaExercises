package it.betacom.foxtrot;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SixthExercise {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> sum = list.stream().reduce((x, y) -> x + y);
		sum.ifPresent(System.out::println);
	}
}
