package SWππΩ√É€¿Ã;
import java.util.*;
public class b1210 
{
	public static int ladder[][]=new int[100][100];
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int tc=1;tc<=10;tc++)
		{
			int dummy=sc.nextInt();
			int startX=0;
			for(int y=0;y<100;y++)
				for(int x=0;x<100;x++)
				{
					ladder[y][x]=sc.nextInt();
					if(ladder[99][x]==2) startX=x;			
				}
			int y=99;
			int x= startX;
		
			while(true)
			{
				if((x-1)>=0&&ladder[y][x-1]==1)
				{
					while((x-1)>=0&&ladder[y][x-1]==1)x--;
				
					y--;
				}
				else if((x+1)<100&&ladder[y][x+1]==1)
				{
				while((x+1)<100&&ladder[y][x+1]==1)x++;
				y--;
				}
				
				else y--;
			
			
				if(y==0)break;
		}
			
		System.out.printf("#%d %d\n", tc, x);		
		}
	}

}
