package 시험공부;
import java.util.Scanner;
public class 문제22 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String a=sc.next();
		char b=sc.next().charAt(0);
		
		if(a.indexOf(b)>-1)
		{System.out.println(a.indexOf(b));}
		else
		{System.out.println("No");}

	}

}
