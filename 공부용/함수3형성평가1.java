package ���ο�;
import java.util.Scanner;
public class �Լ�3������1 {

	public static void Num(int n){
		
		if(n==0)return;
		Num(n/2);
		System.out.printf("%d ",n);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		Num(n);
	}

}
