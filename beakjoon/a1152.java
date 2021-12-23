package beakjoon;
import java.util.*;
public class a1152 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine().trim();

		
		String s[]=a.split(" ");
		
		if(s[0]!="")
			System.out.println(s.length);
		if(s[0]=="")
			System.out.println(0);

	}
}
