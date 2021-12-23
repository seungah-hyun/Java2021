package 공부용;
import java.util.Scanner;
public class 함수3자가진단1 {
	
	public static void Num(int n){
		if(n==0)
			return;
		Num(n-1);
		System.out.println("recursive");
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		Num(n);

	}

}
