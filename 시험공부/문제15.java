package �������;
import java.util.Scanner;
public class ����15 
{
	public static void Sub(int a)
	{
		if(a==0)
			return;
		Sub(a/2);
		System.out.printf("%d ",a);
			
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		Sub(a);

	}

}
