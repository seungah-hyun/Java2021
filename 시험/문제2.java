package 시험;
import java.util.Scanner;
public class 문제2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(1<=a&&a<=9&&1<=b&&b<=9)
		{
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
		}
		
		

	}

}
