package 시험공부;
import java.util.Scanner;
public class 문제7 
{
	public static int Multiple(int a,int b)
	{
		int Dou=1;
		if(a>b)
			{Dou=b*2;
			return Dou;
			}
		else 
			{Dou=a*2;
			return Dou;
			}
	}
	public static int Rest(int a, int b)
	{
		int Re =1;
		if(a>b)
		{
			Re=a/2;
			return Re;
		}
		else
		{
			Re=b/2;
			return Re;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
				
			int mul=Multiple(a,b);
			int rest=Rest(a,b);
			

		System.out.printf("%d %d",mul,rest);

	}

}
