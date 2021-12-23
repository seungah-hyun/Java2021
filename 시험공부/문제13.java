package 시험공부;
import java.util.Scanner;
public class 문제13 {
	public static void Sub(int a)
	{
		if(a==0)
			return;
		System.out.printf("%d ",a);
		Sub(a-1);
				
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		Sub(a);

	}

}
