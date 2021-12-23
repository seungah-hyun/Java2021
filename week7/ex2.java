package week7;

public class ex2 
{

	public static void main(String[] args) 
	{
		String name = "Çö½Â¾Æ";
		char[]a= new char[3];
		
		for(int i =0 ; i<name.length();i++)
		
		    {
			a[i] = name.charAt(i);
			System.out.printf("%c\n",a[i]);	
		    }		
		
		
	}

}
