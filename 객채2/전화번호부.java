package 객채2;
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
		System.out.print("등록된 이름을 작성해주세요");
		String name=sc.next();
		if(name.equals(user[0]))
			return user[1];
		else 
			return "이름을 다시입력하세요";
	}
	
}
public class 전화번호부 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String[]user;
		System.out.print("이름을 입력하셈");
		String name=sc.next();
		System.out.print("번호 점ㅋ ");
		String tel=sc.next();
		
		book b= new book();
		user=b.phone(name,tel);
		
		search s= new search();
		String a= s.searching(user);
		System.out.println(a);
		
	}

}
