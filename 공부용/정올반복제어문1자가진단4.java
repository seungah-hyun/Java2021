package ���ο�;
import java.util.Scanner;
public class ���ùݺ����1�ڰ�����4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int howmany = 0;
		
		while(true)
		{
			int num =sc.nextInt();
			sum+=num;
			howmany+=1;
			if(num>=100)break;
			
		}
		System.out.printf("%d \n%.1f",sum,(double)sum/howmany);
		

	}

}
