package hardproblem;
import java.util.Scanner;
class Phone
{
 private String name;
 private String tel;
 
 public Phone(String name,String tel)
 {
	 this.name=name;
	 this.tel=tel;
	
 }
 public String getName()
 {return name;}
 public String getTel()
 {return tel;}
	
}

public class 전화번호부 
{
	static Phone[]MyPhone;
	
	static String Search(String name)
	{
		for(int i=0;i<MyPhone.length;i++)
		{
			if(MyPhone[i].getName().equals(name))
				return MyPhone[i].getTel();
		}
		return null;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		// 입력받기
		System.out.println("몇명의 친구?");
		int n=sc.nextInt();
		MyPhone =new Phone[n];//n명의 친구를 입력
		
		for(int i=0;i<MyPhone.length;i++)
		{
			System.out.println("이름 :");
			String name=sc.next();
			System.out.println("번호 :");
			String tel=sc.next();
			
			MyPhone[i]=new Phone(name,tel);	
		}
		//전화번호 찾기
		while(true)
		{
			System.out.println("친구이름 입력 or 그만");
			String sign=sc.next();
			if(sign.equals("그만"))
				break;
			String tel=Search(sign);
			if(tel==null)
				System.out.println("없습니다.");
			else
				System.out.println(sign+"의 번호는"+tel);
		}
			
	}

}
