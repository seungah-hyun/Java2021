package 공부용;
import java.util.Scanner;
public class 함수3자가진단2 {

	public static void Num(int N) {
	
		if(N==0)return;
		
		System.out.printf("%d ",N);
		Num(N-1);
	}
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		Num(N);

	}

}
