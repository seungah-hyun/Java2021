package hardproblem;
import java.util.Scanner;
public class no8 {
	
	String name;
	String mail;
	String hotel;
	
	public no8(String a,String b,String c)
	{
		
		name=a;
		mail=b;
		hotel=c;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String a =sc.next();
		String b =sc.next();
		String c =sc.next();
		no8 test=new no8(a,b,c);
		
		System.out.printf("%s\n%s\n%s",test.name,test.mail,test.hotel);
		
		
		

	}

}
