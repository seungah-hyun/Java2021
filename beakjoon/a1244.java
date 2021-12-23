package beakjoon;
import java.util.Scanner;
public class a1244 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int[]b= new int[a];
	
		for(int i=0; i<a;i++)
		{
		b[i]=sc.nextInt();
		}
		int gender=sc.nextInt();
		int where=sc. nextInt();
				
		for(int now=where-1; now < a;now+=where)
		{
			if(b[now]==1)
			{b[now]=b[now]-1;}
			else
			{b[now]=b[now]+1;}
		}
		for(int i=0;i<a;i++)
			System.out.printf("%d ",b[i]);		
	}

}
