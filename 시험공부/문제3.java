package 시험공부;
import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[][]arr1=new int [2][3];
		int[][]arr2=new int [2][3];
		int[][]arr3=new int [2][3];
		System.out.println("first array");
		for(int y=0;y<2;y++)
			for(int x=0;x<3;x++)				
				arr1[y][x]=sc.nextInt();
		
		System.out.println("second array");					
		for(int y=0;y<2;y++)
			for(int x=0;x<3;x++)
				arr2[y][x]=sc.nextInt();
		
		for(int y=0;y<2;y++)
			{for(int x=0;x<3;x++)
				{
				arr3[y][x]=arr2[y][x]*arr1[y][x];
				System.out.printf("%d ",arr3[y][x]);
				}
			System.out.println();
			}
		}
}
