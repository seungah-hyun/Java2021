package SWππΩ√É€¿Ã;
import java.util.Scanner;
public class a1210 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[][]arr=new int[100][100];
		for(int tc=1;tc<=10;tc++)
		{
			int a=sc.nextInt();
			
			for(int y =99;y<-1;y--)
			{
				for(int x=99;x<-1;x--)
				{	
					arr[y][x]=sc.nextInt();
					if(arr[y][x]==2)
					{
						arr[y][x]=arr[y-1][x];
						if(arr[y][x]==1)						
							{
							arr[y][x]=arr[y-1][x];
							
							if(arr[y][x]==arr[y][x-1])
								{
								arr[y][x]=arr[y][x-1];
									{System.out.printf("#%d %d",tc,arr[0][x]);}
								}
							if(arr[y][x]==arr[y][x+1])
								{
								arr[y][x]=arr[y][x+1];
									{System.out.printf("#%d %d",tc,arr[0][x]);}
								}
							}
						
						
					}
					
					
				}
			}
		}
		

	}

}
