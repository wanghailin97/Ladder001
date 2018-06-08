package day5_23;

import java.util.*;

public class J012_MathLong {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long x = input.nextLong();
		long y = input.nextLong();
		input.close();
		System.out.println("高精度整数number1："+x);
		System.out.println("高精度整数number2："+y);
		System.out.println("高精度整数加法："+(x+y));
		System.out.println("高精度整数减法："+(x-y));
		System.out.println("高精度整数乘法："+(x*y));
		System.out.println("高精度整数除法："+(x/y));
	}
}
