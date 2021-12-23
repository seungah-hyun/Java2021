package 공부용;
import java.util.Scanner;
public class 함수1자가진단7 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int ans1 = As1(num1,num2);
		int ans2 = As2(num1,num2);
		
		if(num1<num2)
			{System.out.printf("%d %d",ans1,ans2);}
		else if(num1>num2)
			{System.out.printf("%d %d",ans2,ans1);}
	}
	public static int As1(int num1,int num2)
	{
		int max=0;
		int min=0;
		if(num1>num2)
		{
		max=num1/2;
		min=num2*2;
		}
		else
		{
		max=num2/2;
		min=num1*2;
		}
		return min; 
		
	}
	
	public static int As2(int num1,int num2)
	{
		int max=0;
		int min=0;
		if(num1>num2)
		{
		max=num1/2;
		min=num2*2;
		}
		else
		{
		max=num2/2;
		min=num1*2;
		}
		return max; 
		
	}
	
}
