package 공부용;

public class 배열2형성평가4 
{

	public static void main(String[] args) 
	{
		int sum=0;
		int[][]arr=
			{
					{3,5,9},
					{2,11,5},
					{8,30,10},
					{22,5,1}
			};
		for(int y=0;y<4;y++)
		{	for(int x= 0;x<3;x++)
			{
			sum+=arr[y][x];
			System.out.printf("%d ",arr[y][x]);
			}
		System.out.println();
		}
		
System.out.println(sum);
	}

}
