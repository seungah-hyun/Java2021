package ���ο�;
import java.util.Scanner;
public class ���ùݺ����1������3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum= 0;
		int num = 0;
		double avg = 0;
		
		while(true)
		{
			int c = sc.nextInt();
			if(c>=0&&c<=100)			  
			  {
				sum+=c;
			    num=num+1;
			    avg = (double)sum/num;
			  }
			else
				break;	
			
		}
		System.out.printf("sum : %d\navg : %.1f",sum,avg);

	}

}
