package �������;
import java.util.Scanner;
public class ����17 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("ASCII code =?");
			int a= sc.nextInt();
			if(a>=65&&a<=122)
			{System.out.println((char)a);}
			else
				break;
		}

	}

}
