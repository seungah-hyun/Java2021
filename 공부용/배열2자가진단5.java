package ���ο�;
import java.util.Scanner;
public class �迭2�ڰ�����5 
{

	public static void main(String[] args) 
	{
		int[][]arr1=new int[2][4];
		int[][]arr2=new int[2][4];
		int[][]ans=new int[2][4];
		
		Scanner sc =new Scanner(System.in);
		System.out.println("first array");
		

		for(int y=0;y<2;y++)
			for(int x=0;x<4;x++)				
				arr1[y][x]=sc.nextInt();
		System.out.println("second array");
		for(int y=0;y<2;y++)
			for(int x=0;x<4;x++)				
				arr2[y][x]=sc.nextInt();
		
		for(int y=0;y<2;y++)
			{for(int x=0;x<4;x++)
				{if(y==0)
		{ans[y][x]=arr1[y][x]*arr2[y][x];}
				
		
				if(y==1)
		{ans[y][x]=arr1[y][x]*arr2[y][x];}
		System.out.printf("%d ",ans[y][x]);
				}
		System.out.println();	
			}		
					
		}
}
