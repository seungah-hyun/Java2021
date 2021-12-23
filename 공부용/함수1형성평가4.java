package 공부용;
import java.util.Scanner;
public class 함수1형성평가4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=As(a,b);
		
		
		System.out.println(ans);
		
		
	}
	public static int As(int a,int b)
	{
		int num=0;
		while(true)
		{
			if(a>b)
			{num=a*a-b*b;
			break;}
			
			else if(a<b)
			{num=b*b-a*a;
			break;}
			

		
		}
		return num;
	}
	
	
	
}
