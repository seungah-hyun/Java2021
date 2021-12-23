package SW멘토링;
import java.util.*;
public class arraysort {

	public static void main(String[] args) {
		final int SIZE = 20;
		int[] numbers = new int[20];

		for(int i = 0; i < SIZE; i++){
			int rand = (int) (Math.random() * 100);
			numbers[i] = rand;
		}
		
		System.out.println("처음 배열");
		for(int r : numbers)
			System.out.print(r+" ");
		System.out.println();
		
		// 정렬을 하면 됩니다.

		Arrays.sort(numbers);
			

		System.out.println("정렬된 배열");
		for(int r : numbers)
			System.out.print(r+" ");
		System.out.println();

	}

}
