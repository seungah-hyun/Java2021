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

public class ��ȭ��ȣ�� 
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
		// �Է¹ޱ�
		System.out.println("����� ģ��?");
		int n=sc.nextInt();
		MyPhone =new Phone[n];//n���� ģ���� �Է�
		
		for(int i=0;i<MyPhone.length;i++)
		{
			System.out.println("�̸� :");
			String name=sc.next();
			System.out.println("��ȣ :");
			String tel=sc.next();
			
			MyPhone[i]=new Phone(name,tel);	
		}
		//��ȭ��ȣ ã��
		while(true)
		{
			System.out.println("ģ���̸� �Է� or �׸�");
			String sign=sc.next();
			if(sign.equals("�׸�"))
				break;
			String tel=Search(sign);
			if(tel==null)
				System.out.println("�����ϴ�.");
			else
				System.out.println(sign+"�� ��ȣ��"+tel);
		}
			
	}

}
