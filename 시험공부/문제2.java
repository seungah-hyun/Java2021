package 시험공부;

public class 문제2 {

	public static void main(String[] args) {
		
		int[][]arr={
				{3, 5, 9}, 
				{2, 11, 5}, 
				{8, 30, 10}, 
				{22, 5, 1}};
		int num=0;
		for(int y=0;y<4;y++)
		{
			for(int x=0;x<3;x++)
			{
				num+=arr[y][x];
				System.out.printf("%d ",arr[y][x]);
			}
			System.out.println();
		}
		System.out.print(num);
	}

}
