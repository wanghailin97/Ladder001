package day5_23;

import java.util.*;

public class J012_MathLong {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long x = input.nextLong();
		long y = input.nextLong();
		input.close();
		System.out.println("�߾�������number1��"+x);
		System.out.println("�߾�������number2��"+y);
		System.out.println("�߾��������ӷ���"+(x+y));
		System.out.println("�߾�������������"+(x-y));
		System.out.println("�߾��������˷���"+(x*y));
		System.out.println("�߾�������������"+(x/y));
	}
}
