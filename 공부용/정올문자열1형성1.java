package ���ο�;
import java.util.Scanner;
public class ���ù��ڿ�1����1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		int minus=0;
		int sum = (int)a+(int)b;
		if((int)a>(int)b)		
			 minus= (int)a-(int)b;
		else
			minus = (int)b-(int)a;
		
		System.out.printf("%d %d",sum,minus);
		
	}

}
