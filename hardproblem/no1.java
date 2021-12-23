package hardproblem;
import java.util.Scanner;
public class no1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		int c=0;
		int box=a;
		while(a!=0)
			{
			
			c=a%10;
			
			b=b*10+c;
			a=(int)(a/10);
			}
			if(box==b)
			{System.out.println("yes");	
			
			}
			else 
			{System.out.println("nope");
				
			}
	
	}

}
