package �⸻���;
import java.util.*;

import Arraylist.Friend;
class ����{
	
	private String ID;
	private String PW;
	private double point;
	public ����(double point,String ID,String PW) {
		
		this.point=point;
		this.ID=ID;
		this.PW=PW;
	}
	public void ����() {
		this.point=point;
	}
	public double set����(double point) {
	
		return point;
	}public boolean ����Ȯ��(double point) {
	
		return true;
	}
	
	
}
public class a3 
{
	
		
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String Pi="ProId";
		String Pp="ProPw";
		
		String Si="StuId";
		String Sp="StuPw";
		double point;
	while(true)
	{
		System.out.println("�α����ϼ���");
		String Id=sc.next();
		String Pw=sc.next();
		���� in=new ����( 0, Id, Pw);
		if(Id.equals(Pi)&&Pw.equals(Pp))
		{
			System.out.println("�л��� ������ �Է����ּ���");
			point=sc.nextDouble();			
			in.set����(point);			
			System.out.println("�α׾ƿ��մϴ�.");
			break;
		}		
	}
	while(true)
	{
		System.out.println("�α����ϼ���");
		String Id=sc.next();
		String Pw=sc.next();
		���� in=new ����( 0, Id, Pw);
		if(Id.equals(Si)&&Pw.equals(Sp))
		{
		System.out.println("�л������� Ȯ���ϼ���");
		if(in.����Ȯ��(point))	
			System.out.println(in.set����(point));
		break;
		}
	}

	}
	}

