package ����;
import java.util.Scanner;
public class ����6 {

	public static void main(String[] args) 
	{
		//�����ǹ���
		//�Է¹޴� �ø� �ʷ� ��Ÿ����!!
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int Minute=60;
		int Second=60;
		int whatSecond=0;
		int oneHour=Minute*Second;
		for(int i=1;i<=24;i++)
		{
			if(i==hour)
			{
				whatSecond=hour*oneHour;
				
			}
		}
		
		System.out.printf("%d",whatSecond);	

		
	}

}
