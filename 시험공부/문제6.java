package 시험공부;
import java.util.Scanner;
public class 문제6 
{
	public static int Num(int a, int b)
	{	
		int fir=1;
		for(int i=1;i<=b;i++)
			fir*=a;	
		return fir;
	}

	public static void main(String[] args) 
	{		
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int num=Num(a,b);
		System.out.println(num);
		
	}

}
