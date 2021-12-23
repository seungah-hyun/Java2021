package 공부용;

public class 배열2자가진단7 {

	public static void main(String[] args) {
		int[][]arr=new int[5][5];
		
		for(int y=0;y<5;y++)
		{
			for(int x= 0; x<5;x++)
			{
				if(y==0||x==0)
					arr[y][x]=1;
				else
					arr[y][x]=arr[y-1][x]+arr[y][x-1];
						
			}
			
		}
		for(int y=0;y<5;y++)
			{for(int x= 0; x<5;x++)
				{
				System.out.printf("%d ",arr[y][x]);
				}
		
				System.out.println();
			}
	}

}
