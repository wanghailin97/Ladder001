package day5_23;

public class J005_Multiplication {
	public static void main(String[] args) {
		for(int i = 1;i <= 9;i++) {
			for(int j =1;j <= i;j++) {
				System.out.print(j+"��"+i+"="+i*j+"\t");//"\t"��ʾ��ӡһ���ո�
			};
			System.out.println();//��ʾ��һ�д�ӡ
		}
	}
	
}
