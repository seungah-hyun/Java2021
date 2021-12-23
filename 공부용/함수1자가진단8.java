package 공부용;
import java.util.Scanner;
public class 함수1자가진단8 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		//int ans=As1(a,b);
		int num1=0;
		int num2=0;
		if(a>b)
		{num1=a;
		num2=b;}
		else if	(a<b)
		{num2=a;
		num1=b;}
		
		for (int i =num2;i<=num1;i++)
		{
		System.out.printf("== %ddan ==",i);
		System.out.println();
			for(int j =1;j<=9;j++)
			{
				System.out.printf("%d * %d = %2d",i,j,i*j);
				System.out.println();
				
			}
			System.out.println();
		}
	}
}
//	public static int As1(int a,int b)
//	{
//		int num=1;
//		for(int i=a;i<=b;i++)
//		{
//			for(int j=1;j<=9;j++)
//			{
//				num=i*j;					
//			}		
//		}
//		return num;
//	}

