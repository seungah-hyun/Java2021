package ���ο�;
import java.util.Scanner;
public class ���ùݺ����1������4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		while(true)
		{
			int num = sc.nextInt();
			if(num%3!=0&&num%5!=0)
			{
			a=a+1;	
			}
			if(num==0)
				break;
			
				
		}
System.out.println(a);	

	}

}
