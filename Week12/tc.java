package Week12;
import java.io.*;
import java.util.*;
public class tc {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a/b);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}	
		
	}

}
