package 공부용;
import java.util.Scanner;
public class 배열1자가진단6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]num=new int[10];
		for(int i=0 ; i<10 ; i++)
		{
			num[i]=sc.nextInt();
		}
		int min = 9876213;
		int wheremin=-1;
		int max=-1;
		int wheremax=-1;
		for(int i =0;i<num.length;i++)
		{
			if(min>num[i])
			{
				min=num[i];
				wheremin=i;
			}
			if(max<num[i])
			{
				max=num[i];
				wheremax=i;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
