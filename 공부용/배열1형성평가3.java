package 공부용;
import java.util.Scanner;
public class 배열1형성평가3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[]num = new int[10]; 
		int odd=0;
		int even=0;
		for(int i=0;i<10;i++)
		{
			num[i]=sc.nextInt();
		}
odd=num[0]+num[2]+num[4]+num[6]+num[8];
even=num[1]+num[3]+num[5]+num[7]+num[9];
		
System.out.printf("odd : %d\neven : %d",odd,even);		

	}

}
