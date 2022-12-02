package javaQues;

public class PrintHelloCaps {

	public static void main(String[] args) {
		String str = "ahceclwlxo";
		for (int i = 1; i < str.length(); i = i + 2) {
			System.out.print(String.valueOf(str.charAt(i)).toUpperCase());
		}
	}

}
