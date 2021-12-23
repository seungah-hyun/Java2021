package Arr;
import java.util.ArrayList;
import java.util.Scanner;
public class CharArraylist {
	public static void main(String[] args) 
	{
		ArrayList<Character>c=new ArrayList<Character>();
		
		Scanner sc= new Scanner(System.in);
				
		for(int i=0;i<5;i++)
		{
			char a=sc.next().charAt(0);
			c.add(a);
			
		}
		double sum=0.0;
		double avg=0.0;
		for(int i=0;i<c.size();i++)
		{
			if(c.get(i)=='A')
			{
				sum+=4.0;
			}
			else if(c.get(i)=='B')
			{
				sum+=3.0;
			}
			else if(c.get(i)=='C')
			{
				sum+=2.0;
			}
			else if(c.get(i)=='D')
			{
				sum+=1.0;
			}
			else if(c.get(i)=='F')
			{
				sum+=0.0;
			}
						
		}
		avg=sum/5;
		System.out.println(avg);
	
	}
}
