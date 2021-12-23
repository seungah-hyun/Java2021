package 시험공부;
import java.util.Scanner;
public class 문제5 
{
	public static int Max(int a, int b, int c)
	{
		int max=-32134;
		if(a>b&&b>c||a>c&&c>b)
		{	if(max<a)
			{max=a;}			
		}
		if(c>b&&b>a||c>a||a>b)
		{
			if(max<c)
			{max=c;}
		}
		if(b>c&&c>a||b>a&&a>c)
		{
			if(max<b)
			{max=b;}
		}
		if(max==-32134)
		{
			max=a;
		}
		return max;
	
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println(Max(a,b,c));
		
	}

}
