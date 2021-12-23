package 시험공부;
import java.util.Scanner;
public class 문제8 
{
	public static void MultiTable(int a, int b)
	{
		for(int i=a;i<=b;i++)
		{
			System.out.printf("==%ddan==\n",i);
			for(int j=1;j<10;j++)
			{
				System.out.printf("%d * %d = %d \n",i,j,i*j);
			}
			System.out.println();
		}
		return;
			
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		MultiTable(a,b);

	}

}
