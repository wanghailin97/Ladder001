package day5_23;

import java.util.*;

public class J008_GcdAndGcm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		input.close();
		int Gcd = Math.max(m, n);
		while((m % Gcd != 0)||(n % Gcd != 0)) {
			Gcd--;
		}
		int Gcm = m *n / Gcd;
		System.out.println("最大公约数为："+Gcd);
		System.out.println("最小公倍数为："+Gcm);
	}
}
