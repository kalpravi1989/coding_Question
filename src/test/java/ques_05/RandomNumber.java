package ques_05;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {

		Random rn = new Random();
		int answer = rn.nextInt(10) + 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1-9");
		int num = sc.nextInt();
		if (num < answer) {
			System.out.println("low");
		} else if (num > answer) {
			System.out.println("high");
		} else if (num == answer) {
			System.out.println("Right guess");
		}
	}
}
