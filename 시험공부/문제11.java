package 시험공부;
import java.util.Scanner;
public class 문제11 
{
	public static void arr(int a)
	{
		int [][]arr=new int[a][a];
		for(int y=0;y<a;y++)
		{
			for(int x=0;x<a;x++)
			{
				
				if(y==0)
				{arr[y][x]=x+1;}
				if(x==0)
				{arr[y][x]=y+1;}				
				if(y>0&&x>0)
				{arr[y][x]=arr[y][0]*arr[0][x];}
											
			}
		}
		for(int y=0;y<a;y++)
		{
			for(int x=0;x<a;x++)
			{System.out.printf("%d ",arr[y][x]);}
		System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		arr(a);
	}

}
