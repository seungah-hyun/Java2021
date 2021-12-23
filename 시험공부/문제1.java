package 시험공부;

public class 문제1 
{
	public static void main(String[] args) 	
	{
		int[][]arr=new int[5][5];
		for(int y=0;y<5;y++)
		{
			for(int x= 0;x<5;x++)
			{
				arr[y][x]=1;
			}
		}
		
		{	for(int y=0;y<5;y++)
			{
				for(int x= 0;x<5;x++)
				{
					if(x<4&&y<4)
					arr[y+1][x+1]=arr[y][x+1] +arr[y+1][x];
					System.out.printf("%d ",arr[y][x]);
				}
			System.out.println();	
			}
		}
		
	}
}
