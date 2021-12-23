package 공부용;
import java.util.Scanner;
public class 정올문자열1자가6 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		while(true)
		{
			char a= sc.next().charAt(0);
			if((int)a>=65&&(int)a<=122)
				{
				System.out.println(a);
				}
			else if((int)a>=48&&(int)a<=57)
				{
				System.out.println((int)a);
				}
			else
				break;
		}
	}

}
