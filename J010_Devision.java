package day5_23;

import java.util.*;

public class J010_Devision {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		input.close();
		if((x % 3 == 0)&(x % 5 == 0)&(x % 7 == 0)) {
			System.out.println("����ͬʱ��3��5��7������");
		}
		else {
			System.out.println(x+"�����Ա�3,5,7ͬʱ���� ");
		}
		
	}
}
