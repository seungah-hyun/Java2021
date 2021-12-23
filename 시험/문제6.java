package 시험;
import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) 
	{
		//나만의문제
		//입력받는 시를 초로 나타내라!!
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
