package hi;
import java.util.*;
/*
1 1 1 1 1
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1
1 1 1 1 1
 
 */
public class ¿¬½À {
	
	public static int Data[][]=new int[5][5];
	
	public static boolean IsSafe(int y,int x)
	{
		if(x>=0&&x<5&&y>=0&&y<5)return true;
		else return false;
	}
	public static int MyAbs(int a, int b)
	{
		if(a>b) return a-b;
		else return b-a;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		for(int y=0;y<5;y++)
			for(int x=0;x<5;x++)
				Data[y][x]=sc.nextInt();
		int[] dy= {-1,1,0,0};
		int[] dx= {0,0,-1,1};
		int sum=0;
		
		for(int y=0;y<5;y++)
		{
			for(int x=0;x<5;x++)
			{
				for(int dir =0; dir<4;dir++)
				{
					int newY=y+dy[dir];
					int newX=x+dx[dir];
					if(IsSafe(newY,newX))
						sum+=MyAbs(Data[y][x],Data[newY][newX]);
						
				}
			}
		}
		System.out.print(sum);
			
	}

}
