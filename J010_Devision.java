package day5_23;

import java.util.*;

public class J010_Devision {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		input.close();
		if((x % 3 == 0)&(x % 5 == 0)&(x % 7 == 0)) {
			System.out.println("可以同时被3、5、7整除。");
		}
		else {
			System.out.println(x+"不可以被3,5,7同时整除 ");
		}
		
	}
}
