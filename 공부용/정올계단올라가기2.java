package 공부용;
import java.util.Scanner;
public class 정올계단올라가기2 {

	public static int Case(int n) {
		if(n==0)return 0;
		if(n==1)return 1;
		if(n==2)return 2;
		else return Case(n-1)+Case(n-2);			
	}	
	public static void main(String[] args) {
			
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	
	System.out.println(Case(n));	
	}

}
