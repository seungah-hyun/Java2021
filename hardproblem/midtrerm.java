package hardproblem;
import java.util.*;
class Dictionary
{
	private static String[]kor = {"�ڹ�","���̽�","��","����"};
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
		System.out.println("�ܾ��Է�. ��ġ������� stop �Է�");
		String what =sc.next();
		if(what.equals("stop"))
			break;
		String engword=Dictionary.translate(what);
		
		if (engword==null)
		{
		System.out.println("�ٽ� �ۼ����ּ���");
		continue;
		}
		else
		{
		System.out.println(Dictionary.translate(what));
		}
		
			
		}
		
	}

}
