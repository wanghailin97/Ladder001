package day5_23;

import java.util.Arrays;

public class J007_CharRange {
	public static void main(String[] args) {
		String str[] = {"dgdge","ssdfd","adsdf","ewsvs"};
		Arrays.sort(str);//���ַ������鰴�ֵ�˳������
		//��ӡ����
		for(int i = 0;i < str.length;i++) {
			System.out.println(str[i]);
		}
	}
}
