package ���ο�;
import java.util.Scanner;
public class �迭2������7 
{

	public static void main(String[] args) 
	{
		int[][]arr1=new int[2][3];
		int[][]arr2=new int[2][3];
		int[][]ans=new int[2][3];
		Scanner sc= new Scanner(System.in);
		System.out.println("first array");
		for(int y=0;y<2;y++)
			{
			for(int x=0;x<3;x++)
			{
				arr1[y][x]=sc.nextInt();
			}
			}
		System.out.println("second array");
		for(int y=0;y<2;y++)
			{
			for(int x=0;x<3;x++)
			{
			arr2[y][x]=sc.nextInt();			
			}
			}
		for(int y=0;y<2;y++)
			{
			for(int x=0;x<3;x++)
			{
				ans[y][x]=arr1[y][x]*arr2[y][x];
				System.out.printf("%d ",ans[y][x]);
			}
			System.out.println();
			}	
		

	}

}
