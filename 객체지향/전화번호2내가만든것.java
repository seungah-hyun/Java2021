package ��ü����;
import java.util.Scanner;
class book{
	String user[]=new String[2];
	public String[] book(String name,String tel)
	{
		user[0]=name;
		user[1]=tel;
		
		return user;
	}
}

class search{
	String name;
	public String search(String[] user)
	   {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("�̸��� �Է��ϼ���");
	      name = sc.next();
	      if(name.equals(user[0]))
	         return user[1];
	      return "�̸��� Ȯ���ϼ���.";
	   }
		
	}



public class ��ȭ��ȣ2��������� {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name,number;
		String []user;
		String ans;
		System.out.print("�̸��� �Է��ϼ���");
		name=sc.next();
		System.out.print("��ȣ�� �Է��ϼ���");
		number=sc.next();
		
		 book is = new book();
	     user = is.book(name, number);
	      
	     search sr = new search();
	     ans = sr.search(user);
	     System.out.println(ans);

	}

}
