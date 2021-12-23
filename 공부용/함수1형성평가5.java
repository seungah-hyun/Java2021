package 공부용;
import java.util.Scanner;
public class 함수1형성평가5 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int a=0;
		int[][]ans1=As(a);
		
		for(int y=0;y<4;y++)
		{
			for(int x=0;x<4;x++)
			{System.out.print(ans1[y][x]+" ");}
			System.out.println();
		}
		
	}
	
	public static int[][]As(int a)
	{
		Scanner sc= new Scanner(System.in);
		int[][]arr1=new int[3][3];
		for(int y=0;y<3;y++)
		{
			for(int x=0;x<3;x++)
			{
				arr1[y][x]=sc.nextInt();
			}
		}
		
		int[][]arr2=new int[4][4];
		for(int y=0;y<3;y++)
		{
			for(int x=0;x<3;x++)
			{
				arr2[y][x]=arr1[y][x];								
			}
		}
		
		for(int y=0;y<3;y++)
		{int Re=0;
			for(int x=0;x<3;x++)
			{		if(y==0)
					{
					Re+=arr1[y][x];					
					arr2[y][3]=Re;
					}
					if(y==1)
					{
					Re+=arr1[y][x];					
					arr2[y][3]=Re;
					}
					if(y==2)
					{
					Re+=arr1[y][x];					
					arr2[y][3]=Re;
					}						
			}
			
		}
		
		for(int y=0;y<3;y++)
		{int Re=0;
			for(int x=0;x<3;x++)
			{
				if(y==0)
				{
				Re+=arr1[x][y];					
				arr2[3][y]=Re;
				}
				if(y==1)		
				{
				Re+=arr1[x][y];					
				arr2[3][y]=Re;
				}
				if(y==2)
				{
				Re+=arr1[x][y];					
				arr2[3][y]=Re;
				}		
			}
		}
		
		
		
		
		
		
		
		int num=0;
		for(int y=0;y<3;y++)
		{
			for(int x=0;x<3;x++)
			{
				num+=arr1[y][x];
				
			}
		}
		arr2[3][3]=num;
		
		
		
		for(int y=0;y<4;y++)
		{
			for(int x=0;x<4;x++)
			{							
										
			}
		}
		
		return arr2;
	}
	
}
