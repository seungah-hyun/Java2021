package hi;
import java.util.Scanner;
public class 모래시계 
{
	public static int Data[][]=new int [6][6];
	
	public static int test1(int [][]Data)
	{	
		
		int max= -12314;
		int sum=0;
		
			for(int y=0; y<6;y++)
			{
			for(int x=0;x<6;x++)		
				{
				
				if(x>=0&&x<4&&y>=0&&y<4)
					{
					sum=Data[y][x]+Data[y][x+1]+Data[y][x+2]+Data[y+1][x+1]+Data[y+2][x]+Data[y+2][x+1]+Data[y+2][x+2];
					
					if(max<sum)
					{
						max=sum;
					}					
					}
				}
			}			
		return max;		
	}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		for(int y=0; y<6;y++)
			for(int x=0;x<6;x++)			
				{Data[y][x]=sc.nextInt();}
		int sum=0;
		int max=-32434;
		int a=0;
		max=test1(Data);
		System.out.println(max);
			
	}

}
