package ��ä2;
import java.util.Scanner;
class Champhion{
	static Champhion[]List;
	String name;
	String q,w,e,r;
	public Champhion(String name,String q,String w,String e,String r) {
		
		this.name=name;
		this.q=q;
		this.w=w;
		this.e=e;
		this.r=r;
		
	}
	static void print() {
		for(int i=0;i<List.length;i++)
		{
			System.out.print("������ :"+List[i].name+"\n�̵��Ÿ� :"+List[i].q+"\n");
			System.out.print("���ݱ��1 :"+List[i].w+"\n���ݱ��2 :"+List[i].e+"\n�����1 :"+List[i].r+"\n");
			
		
		}
		
	}
	static void run() {
		String name,q,w,e,r;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("����� 1�� / ��ϵ� è�Ǿ� ����� 2�� /3���� �����մϴ�.");
		System.out.println("����� �ȵǾ����� 1���� �����ּ���");
		int sign=sc.nextInt();
		if(sign==1)
			{
			System.out.print("����� ������ ����Ͻǰǰ���?");
			int num=sc.nextInt();
			
			System.out.println("����Ͻ� ������ �̸��� �̵��Ÿ��� ��ų�� �����ּ���");
			List=new Champhion[num];
			for(int i=0;i<num;i++)
				{	
					System.out.print("���� :");		
					name=sc.next();
					System.out.print("�̵��Ÿ� :");
					q=sc.next();
					System.out.print("���ݱ��1 :");
					w=sc.next();
					System.out.print("���ݱ��2 :");
					e=sc.next();
					System.out.print("�����1 :");
					r=sc.next();
					List[i]=new Champhion(name,q,w,e,r);
				}
			continue;
			
			}
		if(sign==2)
			{
				Champhion.print();	
				
			}
		else if(sign==3)
			{
			System.out.println("������ �����ϴ� ������ �ʱ�ȭ�� �����մϴ�.");
			
			break;
			}
		else
		{
		System.out.println("�߸��ȹ�ȣ�� �ٽ��Է����ּ���");
		}
					
	}
}	
}		
public class LoL {
	
	public static void main(String[] args) {
			
					Champhion.run();
	}

}
