package week7;

public class ex4 
{

	public static void main(String[] args) 
	{
		int[]score = {10,20,30};
		int sum = 0;
		int avg = 0;
		
		for(int i=0;i<3;i++)
		{		
			sum+=score[i];
			avg=sum/3;
								
		}
		System.out.printf("%d\n %d",sum,avg);		
		
		

	}

}
