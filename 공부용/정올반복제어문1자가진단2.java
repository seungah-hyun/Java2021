package 공부용;
import java.util.Scanner;
public class 정올반복제어문1자가진단2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int a= 0;
		int sum=0;
		if(num>0 && num<=100)
		{
		 while(true)
		 {
			a+=1;
			sum+=a;
			if(a==num)
				break;
			 
		 }
		System.out.println(sum);	
			
		}
		
		
	}

}
