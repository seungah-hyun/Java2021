package ���ο�;
import java.util.Scanner;
public class �������ڰ�����4 {

	public static void main(String[] args) {
		Scanner ab = new Scanner (System.in);
		
		int a = ab.nextInt();
		int b = ab.nextInt();
		int c = a++;// �����ǹ߰� ��ġ������ c=a�� �����ϰ� ���߿� a�������Ѵ�! ����
		int d = --b;
		
		System.out.println(a+" "+b+" "+c*d);
		System.out.print(a);
		
		
		

	}

}
