package ���ο�;
import java.util.Scanner;
public class �Լ�3������2 {
	
	public static void Num(int n){
		if(n==0 || n==-1)return;
		
		if(n%2!=0)		
		{
			Num(n-2);
			System.out.printf("%d ",n);
		}
		if(n%2==0)
		{
			Num(n-2);
			System.out.printf("%d ",n);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Num(n);
		
	}

}
