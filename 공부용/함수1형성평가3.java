package ���ο�;
import java.util.Scanner;
public class �Լ�1������3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();		
		int[][]ans=As(a);
		for(int y=0;y<a;y++)
		{
			for(int x=0;x<a;x++)
			System.out.print(ans[y][x]+" ");
			System.out.println();
		}
	}
	
	public static int[][]As(int a)
	{
		int[][]arr=new int[a][a];
		arr[0][0]=1;
		for(int y=0;y<a;y++)
		{	
			if(y!=0)
			{
				arr[y][0]=arr[y-1][0]+1;
			}		
			for(int x=0;x<a;x++)
			{
			if(x!=0)
			{arr[y][x]=arr[y][0]*(x+1);}
			}
		}
		return arr;		
	}
	
}
