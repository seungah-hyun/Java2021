package ���ο�;
import java.util.Scanner;
public class �Լ�1������2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int ans = As(a);
		System.out.println(ans);
	}
	public static int As(int a)
	{	
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum+=i;
		}
		return sum;
	}
}
