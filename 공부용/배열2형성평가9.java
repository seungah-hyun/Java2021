package 공부용;
import java.util.Scanner;
public class 배열2형성평가9 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int[][]arr=new int[10][10];
		for(int y=0;y<a;y++)
		{
			for(int x=0;x<1;x++)
			{			
				{
				arr[y][x]=1;
				arr[y][y]=1;
				}												
			}
					
		}
		for(int y=2;y<a;y++)
		{
			for(int x=1;x<y;x++)
			{
				arr[y][x]=arr[y-1][x]+arr[y-1][x-1];	
			}
			
		}
		for(int y=a-1;y>-1;y--)
		{
			for(int x=y;x>=0;x--)
			{
				System.out.printf("%d ",arr[y][x]);
				
			}
			System.out.println();
		}
		
		
		
	}		
}