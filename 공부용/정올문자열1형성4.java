package ���ο�;
import java.util.Scanner;
public class ���ù��ڿ�1����4 {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	String a= sc.next();
	char b= sc.next().charAt(0);
	if(a.indexOf(b)>-1)
	{
		int where=a.indexOf(b);
		System.out.println(where);
	}
	else
		System.out.println("No");

	}

}
