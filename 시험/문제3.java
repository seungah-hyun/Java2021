package ����;
import java.util.Scanner;
public class ����3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]a=new int[9];
		int max=-1;
		int num=0;
		for(int i=0;i<9;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>max)
			{
				num++;
				max=a[i];
			}
			
		}
System.out.printf("%d\n%d",max,num);
	}

}
