package day5_23;

import java.util.Arrays;

public class J007_CharRange {
	public static void main(String[] args) {
		String str[] = {"dgdge","ssdfd","adsdf","ewsvs"};
		Arrays.sort(str);//对字符串数组按字典顺序排列
		//打印数组
		for(int i = 0;i < str.length;i++) {
			System.out.println(str[i]);
		}
	}
}
