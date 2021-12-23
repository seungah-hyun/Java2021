package 공부용;
import java.util.Scanner;
public class 정올반복제어문1형성평가2 {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int b= 0;
	int c= 0;
	
	while(true)
	{
		
		int a = sc.nextInt();
		
		
		if(a%2!=0)
		{
			b=b+1;
		}
		if(a%2==0&&a!=0)
		{
			c=c+1;
			
		}
		if(a==0)
			break;
		
	}
	System.out.printf("odd : %d\neven : %d",b,c);
	}

}
