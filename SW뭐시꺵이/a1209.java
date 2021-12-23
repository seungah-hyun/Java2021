package SWππΩ√É€¿Ã;
import java.util.Scanner;
public class a1209 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
				
		for(int i=1;i<=10;i++)
		{	
			int[][]arr=new int[100][100];
			int max=-1;
			int sum=0;
			int num=sc.nextInt();
			for(int y=0;y<100;y++)
			{
				for(int x=0;x<100;x++)
				{
					arr[y][x]=sc.nextInt();
				}
			}
			for(int y=0;y<100;y++)
			{	sum=0;
				for(int x=0;x<100;x++)
				{
					sum+=arr[y][x];
				}
				if(max<=sum)
				{max=sum;}
			}
			sum=0;
			for(int x=0;x<100;x++)
			{	sum=0;
				for(int y=0;y<100;y++)
				{
					sum+=arr[y][x];
				}
			if(max<=sum)
			{max=sum;}
			}
			sum=0;
			for(int y=0;y<100;y++)
			{	sum=0;
				sum+=arr[y][y];
			}
			if(max<sum)
			{max=sum;}
			sum=0;
			for(int y=99, x=0;y>=0;y--,x++)
			{	sum=0;
				sum+=arr[y][x];
			}
			if(max<sum)
			{max=sum;}
			sum=0;
			System.out.println("#"+i+" "+max);
		}
		
		
		

	}

	
		
	
}
