package day5_23;

import java.util.*;

public class J009_Range {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		input.close();
		int[] str = {x,y,z};
		Arrays.sort(str);
		System.out.println(str[0]+" "+str[1]+" "+str[2]);
	}
}
