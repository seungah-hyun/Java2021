package 시험;
import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);	
		int a= sc.nextInt();
		int[]b=new int[a];
		
		int max=-1;
		int min=3543218;
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
			if(max<b[i])
			{max=b[i];}
			if(min>b[i])
			{min=b[i];}
			
		}
System.out.print(max-min);

	}

}
