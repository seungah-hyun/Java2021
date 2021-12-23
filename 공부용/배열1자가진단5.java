package 공부용;
import java.util.Scanner;
public class 배열1자가진단5 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		double num1=85.6;
		double num2=79.5;
		double num3=83.1;
		double num4=80.0;
		double num5=78.2;
		double num6=75.0;
	
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		double[] num=new double[7];
		num[1]=num1;
		num[2]=num2;
		num[3]=num3;
		num[4]=num4;
		num[5]=num5;
		num[6]=num6;
		
		for(int i=1;i<7;i++)
		{
			if(a==i)
			{	a=num[i];}
			if(b==i)
			{	b=num[i];}		
		}
System.out.printf("%.1f ",a+b);	
		
		

	}

}
