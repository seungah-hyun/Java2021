package week7;

public class ex3 {

	public static void main(String[] args) {
		String name = "Çö½Â¾Æ";
		char[]a=new char[3];
		a=name.toCharArray();
		
		for(int i = 0; i<name.length();i++)
		{
			System.out.printf("%c\n",a[i]);
			
		}
		
	}

}
