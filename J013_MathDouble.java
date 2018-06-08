package day5_23;

import java.util.Scanner;

public class J013_MathDouble {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		input.close();
		System.out.println("x+y="+String.format("%.8f",x+y));
		System.out.println("x-y="+String.format("%.8f",x-y));
		System.out.println("x*y="+String.format("%.8f",x*y));
		System.out.println("x/y="+String.format("%.8f",x/y));
	}
}
