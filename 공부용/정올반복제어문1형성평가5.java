package ���ο�;
import java.util.Scanner;
public class ���ùݺ����1������5 {

	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
double a = 0;


		   while(true)
		   {
			   int Base = sc.nextInt();
			   int Height =sc.nextInt();
			   char Continue= sc.next().charAt(0);
			   a=(double)(Base*Height)/2;
			   System.out.printf("Base = ");
			   System.out.printf("Height = ");
			   System.out.printf("Triangle width = %.1f\n",a);
			   
	        if(Continue=='Y' || Continue=='y')
	        {
	        	System.out.printf("Continue? ");
	        }
	        	        	
	        else 
	        {
	        	System.out.printf("Continue? ");
				break;
	        }
		    }
		   

	}

}