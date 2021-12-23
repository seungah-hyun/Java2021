package 공부용;
import java.util.Scanner;
public class 연산자자가진단8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.print((a>b && a>c)+ " " +(a==b && b==c));
		
		
		
	}

}
