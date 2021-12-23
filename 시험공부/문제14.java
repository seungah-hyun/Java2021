package 시험공부;
import java.util.Scanner;
public class 문제14 
{
	public static int Sum(int num)
	{					
		if(num==0)
			return 0;
		else
			return num+Sum(num-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.println(Sum(a));
	}

}
