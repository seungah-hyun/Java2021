package 시험;
import java.util.Scanner;
public class 문제4 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int[]a=new int[5];
		int b=0;
		int c=0;
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			b+=a[i]*a[i];
			
		}
	c=b%10;
		System.out.println(c);
	}

}
