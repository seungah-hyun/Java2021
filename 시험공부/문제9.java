package 시험공부;

public class 문제9 
{
	public static void Sic(String a)
	{	
		for(int i=0;i<9;i++)
			a+="@";
		System.out.printf("first\n%s\nsecond\n%s\nthird\n%s",a,a,a);
		
		
	}
	
	
	public static void main(String[] args) 
	{
		String a="@";
		Sic(a);

	}

}
