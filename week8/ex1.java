package week8;

public class ex1 {

	public static void main(String[] args) {
		int[][] arr=
			{
					{5,8,10,6,4},
					{11,20,1,13,2},
					{7,9,14,22,3}		
			};
		for(int y = 0; y<arr.length;y++)
			{for(int x=0;x<arr[y].length;x++)
			{
				System.out.printf("%2d   ",arr[y][x]);
			}
			System.out.println();
			}

	}

}
