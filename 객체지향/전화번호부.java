package ��ü����;
import java.util.*;
	class insertion
	{
	   String user[] = new String[2];
	   
	   public String[] insertion(String name, String number)
	   {
	      user[0] = name;
	      user[1] = number;
	      
	      return user;
	   }
	}

	class searching
	{
	   String name;
	   public String searching(String[] user)
	   {
	      Scanner sc = new Scanner(System.in);
	      
	      name = sc.next();
	      if(name.equals(user[0]))
	         return user[1];
	      return "�̸��� Ȯ���ϼ���.";
	   }
	}

	public class ��ȭ��ȣ�� {

	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      String name, number;
	      String user[];
	      String ans;
	      
	      name = sc.next();
	      number = sc.next();
	      
	      insertion is = new insertion();
	      user = is.insertion(name, number);
	      
	      searching sr = new searching();
	      ans = sr.searching(user);
	      System.out.println(ans);

	   }

	}

