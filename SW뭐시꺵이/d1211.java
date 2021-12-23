package SWππΩ√É€¿Ã;
import java.util.Scanner;
public class d1211 
{

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		
		for(int tc=1;tc<=10;tc++)
		{
			int ladder[][]=new int[102][102];
			int score=sc.nextInt();
			int min=1241241;
			for(int y=1;y<=100;y++)
				for(int x=1;x<=100;x++)
				{
					ladder[y][x]=sc.nextInt();
				}
			int a,b;
			int startX=0;
			for (int x=1;x<=100;x++)
			{
				if(ladder[1][x]==1)
				{
					b=x;
					int num=0;
					for(int y=0;y<=100;y++)
					{
						num++;
						if(ladder[y][b+1]==1)
						{
							while(true)
							{
								b++;
								num++;
								if(ladder[y][b+1]!=1)
								{break;}
							}
						}
						else if(ladder[y][b-1]==1)
						{
							while(true)
							{
								b--;
								num++;
								if(ladder[y][b-1]!=1)
								{break;}
							}
						}
						if(num<=min)
						{
							startX=x-1;
							min=num;
						}
						
					}
					
				}
				
			}
			System.out.println("#"+tc+" "+startX);
		}
		sc.close();
	}

}
