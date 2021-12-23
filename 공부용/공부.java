package 공부용;
import java.util.Scanner;
public class 공부 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int min=324321;
		int max= -1;
		int[]a=new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();			
			if(a[i]<100)
			{
				if(max<a[i])
					{max=a[i];}
			}
			if(a[i]>=100)
			{
				if(min>a[i])
					{min=a[i];}				
			}
					
		}
		if(max==-1)
		{max=100;}
		if(min==324321)
		{min=100;}
		
System.out.printf("%d %d",max,min);
		
		
		
		
		
	}
}