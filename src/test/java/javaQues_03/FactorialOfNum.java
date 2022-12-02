package javaQues_03;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		int ans = 1;
		System.out.println("Enter  number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 0) {
		for (int i = 1; i <= num; i++) {
			ans = i * ans;
		}
		System.out.println(ans);
	}
}


}
