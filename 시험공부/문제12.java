package 시험공부;
import java.util.Scanner;
public class 문제12 
{
	public static void Num(int a)
	{
		if(a==0)
			return ;
		Num(a-1);
		System.out.println("reclusive");
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		Num(a);

	}

}
