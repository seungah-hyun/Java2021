package 공부용;
import java.util.Scanner;
public class 정올문자열1자가1 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		while(true)
		{	
			System.out.print("ASCII code =? ");
			int num=sc.nextInt();
			if(num>=33&&num<=127)
			{
				System.out.printf("%s\n",(char)num);
			}
			else
				break;
		}

	}

}
