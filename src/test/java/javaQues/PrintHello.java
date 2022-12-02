package javaQues;

public class PrintHello {

	public static void main(String[] args) {
		String str = "ahceclwlxo";
		for (int i = 1; i < str.length(); i = i + 2) {
			System.out.print(str.charAt(i));
		}
	}

}
