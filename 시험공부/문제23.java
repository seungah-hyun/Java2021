package 시험공부;
import java.util.Scanner;
public class 문제23 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String[]arr=a.split(" ");
		for(int i=0;i<arr.length;i++)
		{ 
		System.out.printf("%d %s\n",i+1,arr[i]);	
		}

	}

}
