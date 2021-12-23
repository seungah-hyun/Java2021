package hardproblem;
import java.util.*;
class Dictionary
{
	private static String[]kor = {"자바","파이썬","비","구름"};
	private static String[]eng= {"java","python","rain","cloud"};
	
	public static String translate(String what)
	{
		for(int i=0;i<kor.length;i++)
		{
			if(kor[i].equals(what))
				return eng[i];
		}
		return null;
	}

		
}


public class midtrerm 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("단어입력. 마치고싶으면 stop 입력");
		String what =sc.next();
		if(what.equals("stop"))
			break;
		String engword=Dictionary.translate(what);
		
		if (engword==null)
		{
		System.out.println("다시 작성해주세요");
		continue;
		}
		else
		{
		System.out.println(Dictionary.translate(what));
		}
		
			
		}
		
	}

}
