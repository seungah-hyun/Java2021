package hardproblem;
import java.util.*;

	
	class MemberService
	{
	boolean login(String id,String password)
	{
		if(id.equals("hong")&&password.equals("12345"))
			return true;
		else
			return false;
	}
	void logout(String id)
	{
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	}
	public class javaP268Q3 {
	public static void main(String[] args) 
	{
		MemberService javaP268Q3 =new MemberService();
		boolean result= javaP268Q3.login("hong", "12345");
		if(result)
		{
			System.out.println("�α����� �Ǿ����ϴ�.");
			javaP268Q3.logout("hong");
		}
		else
		{
			System.out.println("id �Ǵ� password�� �ùٸ����� �ʽ��ϴ�.");
		}

	}

}
