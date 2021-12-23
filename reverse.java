import java.util.*;
import java.io.*;
public class reverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String A= sc.next();
		String ans=reverse(A);
		if(A.equals(ans))
			System.out.println("Yes");
		else
			System.out.println("No");
	
	
	}
	public static String reverse(String s) {
		char[] letter=new char [s.length()];
		
		int index=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			letter[index]=s.charAt(i);
			index++;
		}
		
		String reverse="";
		for(int i=0;i<s.length();i++)
		{
			reverse=reverse+letter[i];
		}
		return reverse;
	}
	
}