package 공부용;
import java.util.Scanner;
public class 정올반복제어문1형성평가4 {

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
