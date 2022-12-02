package javaQues_03;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {

		System.out.println("Enter Starting number");
		Scanner sc = new Scanner(System.in);
		int startNum = sc.nextInt();
		System.out.println("Enter ending number");
		int endNum = sc.nextInt();
		for(int i=startNum;i<=endNum;i++) {
			int flag = 0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag = 0;
					break;
				} else {
					flag=1;
				}

			}
			if (flag == 1) {
				System.out.println(i + "prime");
			} else {
				System.out.println(i + "not prime");
			}

		}

	}
	

}
