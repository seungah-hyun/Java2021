package week8;
import java.util.*;
/*
3 
3 17 1 39 8 41 2 32 99 2
22 8 5 123 7 2 63 7 3 46
6 63 2 3 58 76 21 33 8 1 
 */
public class ex2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		
		for(int tc=1; tc<=a;tc++)
		{
		
		int[]Data=new int[10];
		for(int now=0;now<10;now++)
			Data[now]=sc.nextInt();
		
		Arrays.sort(Data);
		System.out.println("#"+tc+" "+Data[9]);//#1 99
		}
		

	}

}
