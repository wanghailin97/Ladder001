package day5_23;

import java.util.Scanner;

public class J002_Interchange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		input.close();
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println(x+" "+y);
	}
}
