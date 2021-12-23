class whatever
	{
		String a= "abc";
		String d="def";
		int year =2021;
		
		public String toString()
		{
			return a+d+year;
		}
	}
public class week11 
{

	public static void main(String[]args)
	{
		whatever w=new whatever();
		System.out.println(w);
		String b= "bcd";
		System.out.println(b.toString());
		
	}
	
}
