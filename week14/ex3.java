package week14;

public class ex3 
{
	public static int GetSome(int[]arr) 
	{
		int what =0;
		for(int i=0;i<arr.length;i++)
		{
			what^=arr[i];
		}
		return what;
		
	}
	
	public static void main(String[] args) 
	{
		int[]Data= {1,2,3,4,1,2,4,3,4};
		
		GetSome(Data);
		System.out.println(GetSome(Data));

	}

}
