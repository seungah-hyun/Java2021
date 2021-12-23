package 시험공부;
import java.util.Scanner;
public class 문제4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int[][]arr1=new int [10][10];
		for(int y=0;y<a;y++)
			for(int x=0;x<a;x++)
			{
				arr1[y][0]=1;
				arr1[y][y]=1;
					
			}
		
		for(int y=0;y<2;y++)
			for(int x=0;x<2;x++)
				{
				arr1[y][x]=1;
				if(y==0)
					arr1[0][1]=0;
				}
		for(int y=2;y<a;y++)
		{
			for(int x=1;x<y;x++)
			{	
				
				arr1[y][x]=arr1[y-1][x]+arr1[y-1][x-1];
				
			}
		}
		for(int y=a-1;y>-1;y--)
			{
			for(int x=y;x>=0;x--)
			{
			System.out.printf("%d ",arr1[y][x]);
			}
			System.out.println();
			}	
	}

}
