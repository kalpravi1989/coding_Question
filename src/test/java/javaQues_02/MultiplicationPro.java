package javaQues_02;

import java.util.Scanner;

public class MultiplicationPro {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}

}
