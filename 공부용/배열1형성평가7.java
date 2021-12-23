package 공부용;
import java.util.Scanner;
public class 배열1형성평가7 
{

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int[]num=new int[100];
	int max = -123;
	int min = 32432156;
	
	for(int i=0;i<100;i++)
	{
		num[i]=sc.nextInt();
		if(num[i]==999)
		{break;}
		if(max<num[i])
		{			
			max=num[i];
		}
		if(min>num[i]) 
		{
			min=num[i];
		}
		
	}
System.out.printf("max : %d\nmin : %d",max,min);
	
		
		

	}

}
