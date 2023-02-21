package it.betacom.bravo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SecondExercise {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("Mario", "Admin"));
		userList.add(new User("Luigi", "Member"));
		userList.add(new User("Giovanni", "Member"));
		userList.add(new User("Maria", "Admin"));
		userList.add(new User("Lucia", "Member"));

		List<User> adminList = userList.stream()
				.filter(user -> user.getRole().equalsIgnoreCase("admin"))
				.collect(Collectors.toList());
		List<User> memberList = userList.stream()
				.filter(user -> user.getRole().equalsIgnoreCase("member"))
				.collect(Collectors.toList());

		adminList.forEach(System.out::println);
		
		System.out.println();

		memberList.forEach(System.out::println);
	}
}
