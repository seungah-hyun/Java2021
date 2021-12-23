package 공부용;
import java.util.Scanner;
public class 함수1자가진단5 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=power(a,b);//a^b를 구하는함수power 작성할예정
		
		System.out.println(ans);
		

	}
	public static int power(int a,int b)
	{
	int val=1;
	for (int now =0;now<b;now++)
		val*=a;
	return val;
	}
	
}
