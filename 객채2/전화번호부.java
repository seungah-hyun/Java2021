package ��ä2;
import java.util.Scanner;

class book{
	String user[]=new String[2];
	public String [] phone(String name,String tel) {
		
		user[0]=name;
		user[1]=tel;
		
		return user;
	}
	
}
class search {
	public String searching(String user[]) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("��ϵ� �̸��� �ۼ����ּ���");
		String name=sc.next();
		if(name.equals(user[0]))
			return user[1];
		else 
			return "�̸��� �ٽ��Է��ϼ���";
	}
	
}
public class ��ȭ��ȣ�� {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[]user;
		System.out.print("�̸��� �Է��ϼ�");
		String name=sc.next();
		System.out.print("��ȣ ���� ");
		String tel=sc.next();
		
		book b= new book();
		user=b.phone(name,tel);
		
		search s= new search();
		String a= s.searching(user);
		System.out.println(a);
		
	}

}
