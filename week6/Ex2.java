package week6;

public class Ex2 
{

	public static void main(String[] args) 
	{
	for(int now = 1;now<=5;now++)
		System.out.println(now+" ");
	
	int sum = 0;
	for(int now = 1; now<=5;now++)
	
		sum+=now;
		System.out.println(sum);
		
	sum=0;
	for(int now =1 ; now <=5;now+=2)
		sum+=now;
	 	System.out.println(sum);
	
	int sumeven= 0;
	int now = 0;
	for( now=0;now<=5;now++)
		{
			if(now%2==0);
				sumeven+=now;
		
		}	
	System.out.println("0부터"+(now-1)+"까지합 :"+sumeven);
	
	
		
		

	}

}
