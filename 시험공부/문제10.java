package 시험공부;
import java.util.Scanner;
public class 문제10 
{	
	public static int Sum(int a)
	{	
		int num=0;
		for (int i=1; i<=a;i++)
		{num+=i;}
		return num;
	}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		int result=Sum(a);
		System.out.println(result);
	}

}
