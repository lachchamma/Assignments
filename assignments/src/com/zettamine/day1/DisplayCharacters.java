package com.zettamine.day1;

import java.util.Scanner;

public class DisplayCharacters {

	public static void main(String[] args) {

		System.out.println("Enter 4 numbers");
		int[] numbers = new int[4];
		displayCharacters(numbers);

	}

	private static void displayCharacters(int[] numbers) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			System.out.println(numbers[i] + "-" + (char) numbers[i]);
		}

		sc.close();

	}

}
