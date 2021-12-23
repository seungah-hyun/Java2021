package 공부용;
import java.util.Scanner;
public class 연산자자가진단4 {

	public static void main(String[] args) {
		Scanner ab = new Scanner (System.in);
		
		int a = ab.nextInt();
		int b = ab.nextInt();
		int c = a++;// 오늘의발견 후치증가는 c=a를 갔다하고 나중에 a만증가한다! 개꿀
		int d = --b;
		
		System.out.println(a+" "+b+" "+c*d);
		System.out.print(a);
		
		
		

	}

}
