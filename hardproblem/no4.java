package hardproblem;
import java.util.Scanner;
public class no4 {
	String name;
	String mail;
	String hotel;

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		no4 sign=new no4();
		sign.name=sc.next();
		sign.mail=sc.next();
		sign.hotel=sc.next();
		
		System.out.println(sign.name);
		System.out.println(sign.mail);
		System.out.println(sign.hotel);
		

	}

}
