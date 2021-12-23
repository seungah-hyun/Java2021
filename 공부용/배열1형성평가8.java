package 공부용;
import java.util.Scanner;
public class 배열1형성평가8 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[]num=new int[100];
		int multiples=0;
		int sum=0;
		double avg =0;
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
			if(num[i]==0)
			{break;}
			if(num[i]%5==0)
			{
			multiples++;
			sum+=num[i];
			
			}
					
		}
		avg=(double)(sum)/multiples;
		System.out.printf("Multiples of 5 : %d\n",multiples);
		System.out.printf("sum : %d\n",sum);
		System.out.printf("avg : %.1f",avg);
	}

}
