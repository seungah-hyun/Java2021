package ���ο�;
import java.util.Scanner;
public class �Լ�3�ڰ�����3 {

	public static int Num(int N) {
		int sum=0;
		if(N==0)return 0;
		return N+Num(N-1);
					
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N =sc.nextInt();
		
		System.out.println(Num(N));
		
	}

}
