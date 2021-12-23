package hi;
import java.util.Scanner;

public class 모래시계1 {

	public static int sum(int[][] arr, int i, int j)//모레시계(7개의 숫자) 합 구하기
	   {
	      int sum = 0;
	      for(int y = i; y < i + 3; y++)
	         for(int x = j; x < j + 3; x++)
	            sum += arr[y][x];
	      sum -= arr[i + 1][j] + arr[i + 1][j + 2];
	      return sum;
	   }
	   
	   public static int find(int[][] arr) //6 6배열에서 3 3 배열의 합 각각 계산하여 최댓값 도출
	   {
	      int max = 0;
	      for(int y = 0; y < 4; y++)
	         for(int x = 0; x < 4; x++)
	            if(max < sum(arr, y, x))
	               max = sum(arr, y, x);
	      return max;
	   }

	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      int[][] arr = new int[6][6];
	      int max = 0;
	      
	      for(int y = 0; y < 6; y++)//6 6배열 생성
	         for(int x = 0; x < 6; x++)
	            arr[y][x] = sc.nextInt();
	      
	      max = find(arr);
	      System.out.println(max);
	   }

	}
