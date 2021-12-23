package SWππΩ√É€¿Ã;

import java.util.Scanner;

public class b1211 {

	public static int ladder[][]=new int[100][100];
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int tc=1;tc<=10;tc++)
		{
			int dummy=sc.nextInt();
			int startX=0;
			int num=0;
			int min=32748;
			int[]arr=new int[10];
			for(int y=0;y<100;y++)
				for(int x=0;x<100;x++)
				{
					ladder[y][x]=sc.nextInt();
					if(ladder[0][x]==1)startX=x;
				}
			int y=0;
			int x=startX;
			while(true)
			{
				if(x>0&&x<99)
				{if ((x-1)>=0&&ladder[y][x-1]==1)
				{
					while((x-1)>=0&&ladder[y][x-1]==1)x++;
				
					y++;
					num+=1;
					
				}
				else if (x+1>=0&&ladder[y][x+1]==1)
				{
					while((x+1)>=0&&ladder[y][x+1]==1)x++;
					
					y++;
					num+=1;
				}
				}
				else 
					y++;
				
				if(y==99)
				num+=1;
				
										
				
				
				
				break;
				
			}
			System.out.printf("#%d %d\n", tc, num);
			
							
		
		}
		
		
		
		

	}

}