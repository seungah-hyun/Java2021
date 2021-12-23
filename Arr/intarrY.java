package Arr;
import java.util.Scanner;
import java.util.ArrayList;

public class intarrY {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> v=new ArrayList<Integer>();
		
		int max=-1;int index=0;
		while(true)
		{
		int n=sc.nextInt();
		if(n==-1)
			break;
		else
		{
			v.add(n);
		}
		}
		for(int i=0;i<v.size();i++)
		{
			if(v.get(i)>max)
			{
				max=v.get(i);
				index=i;
			}
			
		}
		if(v.get(index)==max)
			System.out.println(v.get(index));
		
	}

}
