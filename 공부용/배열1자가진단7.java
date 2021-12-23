package 공부용;
import java.util.Scanner;
public class 배열1자가진단7 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[]num=new int[100];
		int max= -1;
		int min= 1231241;
		for(int i=0; i<10;i++)
		{
			num[i]= sc.nextInt();
			if(num[i]<100)
			{
				if(max<num[i])
					{max=num[i];}												
			}
			if(num[i]>=100)
			{
				if(min>num[i])
					{min=num[i];}							
			}	
		}
		if (max==-1) 
		   {max=100;}
		if (min==1231241)
		   {min=100;}
		         
		System.out.print(max+" "+min);
		

		
	}

}
