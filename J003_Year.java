package day5_23;

import java.util.Scanner;

public class J003_Year {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		input.close();
		if(((year % 4 == 0)&&(year % 100 !=0))||(year % 400 == 0)) {
			System.out.println(year+"��������");
		}
		else {
			System.out.println(year+"�겻������");
		}
	}
}
