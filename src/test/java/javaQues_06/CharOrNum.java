package javaQues_06;

import java.util.Scanner;

public class CharOrNum {

	public static void main(String[] args) {
		System.out.println("enter a character");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean b = Character.isAlphabetic(str.charAt(0));
		if (b == true) {
			System.out.println("An alphabet!I can read your mind");
		} else {
			System.out.println("A number! I can read your mind");
		}

	}

}
