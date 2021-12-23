package hi;

public class ÆÄ½ºÄ® 
{

	public static void main(String[] args) 
	{
		
		int[][]arr=new int[10][10];
		
		for (int y=0;y<10;y++)
		{
			for(int x=0;x<2;x++)
			{
				arr[y][x]=1;
				arr[y][y]=1;
			}
		}
		for(int y=2;y<10;y++)
		{
			for(int x=2;x<10;x++)
			{
			  arr[y][x]=arr[y-1][x-1]+arr[y-1][x];
			  
			}
		
		}
		
		for(int y=1;y<10;y++)
		{
			for(int x=1;x<10;x++)
			{
				if(arr[y][x]!=0)
				{System.out.printf("%d ",arr[y][x]);}
			}
			System.out.println();
		}

	}

}
