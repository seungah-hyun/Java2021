package SW���丵;
import java.util.*;
public class arraysort {

	public static void main(String[] args) {
		final int SIZE = 20;
		int[] numbers = new int[20];

		for(int i = 0; i < SIZE; i++){
			int rand = (int) (Math.random() * 100);
			numbers[i] = rand;
		}
		
		System.out.println("ó�� �迭");
		for(int r : numbers)
			System.out.print(r+" ");
		System.out.println();
		
		// ������ �ϸ� �˴ϴ�.

		Arrays.sort(numbers);
			

		System.out.println("���ĵ� �迭");
		for(int r : numbers)
			System.out.print(r+" ");
		System.out.println();

	}

}
