package 공부용;
import java.util.Scanner;
public class 배열1자가진단1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[]a=new char [10];
		for(int i=0;i<10;i++)
		{
			a[i]=sc.next().charAt(0);
			
		}
System.out.print(a);

	}

}
