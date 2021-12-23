package 공부용;
import java.util.Scanner;
public class 정올반복제어문1형성평가1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=0;
		while(true)
		{
			b=b+1;
			if(a==b)
				break;
			System.out.println(b);
		}
		System.out.println(b);
	}

}
