package 공부용;
import java.util.Scanner;
public class 배열1자가진단4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int []num=new int[100];
		
		for(int i=0;i<100;i++)
		{
			num[i]=sc.nextInt();
			if(num[i]==0)
			{					
				break;
			}			
		}
		for(int i=100-1;i>=0;i--)
		{
			if(num[i]!=0)
			
			System.out.print(num[i]+" ");	
			
		}
		
	}

}
