package day5_23;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class J011_Map {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("apple","Æ»¹û");
		map.put("orange","éÙ×Ó");
		map.put("banana","Ïã½¶");
		Scanner br = new Scanner(System.in);
		String str = br.nextLine();
		br.close();
		System.out.println(map.get(str));
	}
}

