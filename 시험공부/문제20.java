package 시험공부;
import java.util.Scanner;
public class 문제20 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		while(true)
		{	
			char b=sc.next().charAt(0);
			int a=(int)b;
			if(a>=65&&a<=90||a>=97&&a<=122)
			{
				System.out.println(b);
			}
			else if(a>=48&&a<=57)
			{
				System.out.println(a);
			}
			else
				break;			
		}

	}

}
