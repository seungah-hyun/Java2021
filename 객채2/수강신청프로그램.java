package ��ä2;
import java.util.Scanner;
class Memory{
	private String name,point,teacher;
	public Memory(String name,String point,String teacher) {
		
		this.name=name;
		this.point=point;
		this.teacher=teacher;
		
	}
	void a()
	{
		System.out.println("������û :"+name);
		System.out.println("������û :"+point);
		System.out.println("������û :"+teacher);
	}
		
}
public class ������û���α׷� {
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("������û�� ���ּ���");
		String name,point,teacher;

		
		//ó�� ������				
			System.out.print("�������� :");
			name=sc.next();
			System.out.print("���� :");
			point=sc.next();
			System.out.print("��米�� :");
			teacher=sc.next();
		
		Memory m= new Memory(name,point,teacher);
		
		
		// ǥ��
		
		while(true)
		{
			System.out.println("<�޴�>\n�Է� :1,���� :2,�׸� :3");
			int num=sc.nextInt();
			if(num==1)
			{
				System.out.print("�������� :");
				name=sc.next();
				System.out.print("���� :");
				point=sc.next();
				System.out.print("��米�� :");
				teacher=sc.next();
				
				
			continue;
			}
			if(num==2)
			{	
				
				Memory m2= new Memory(name,point,teacher);
				m2.a();
				continue;
				
			}
			else
				break;
		}
		
		
	}

}
