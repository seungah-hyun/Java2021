package 시험공부;
import java.util.Scanner;
public class 문제16 
{
	public static void Sub(int a)
	{
		if(a%2!=0)
			if(a==-1)
				return;
			else
				{
				Sub(a-2);	
				System.out.printf("%d ",a);
				}
		else
			if(a==0)
				return;
			else
				{
				Sub(a-2);
				System.out.printf("%d ",a);
				}
			
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		Sub(a);

	}

}
