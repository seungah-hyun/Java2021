package 객체지향;
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
	      
	      System.out.print("이름을 입력하세요");
	      name = sc.next();
	      if(name.equals(user[0]))
	         return user[1];
	      return "이름을 확인하세요.";
	   }
		
	}



public class 전화번호2내가만든것 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name,number;
		String []user;
		String ans;
		System.out.print("이름을 입력하세요");
		name=sc.next();
		System.out.print("번호을 입력하세요");
		number=sc.next();
		
		 book is = new book();
	     user = is.book(name, number);
	      
	     search sr = new search();
	     ans = sr.search(user);
	     System.out.println(ans);

	}

}
