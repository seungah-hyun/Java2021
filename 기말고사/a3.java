package 기말고사;
import java.util.*;

import Arraylist.Friend;
class 성적{
	
	private String ID;
	private String PW;
	private double point;
	public 성적(double point,String ID,String PW) {
		
		this.point=point;
		this.ID=ID;
		this.PW=PW;
	}
	public void 점수() {
		this.point=point;
	}
	public double set점수(double point) {
	
		return point;
	}public boolean 점수확인(double point) {
	
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
		System.out.println("로그인하세요");
		String Id=sc.next();
		String Pw=sc.next();
		성적 in=new 성적( 0, Id, Pw);
		if(Id.equals(Pi)&&Pw.equals(Pp))
		{
			System.out.println("학생의 점수를 입력해주세요");
			point=sc.nextDouble();			
			in.set점수(point);			
			System.out.println("로그아웃합니다.");
			break;
		}		
	}
	while(true)
	{
		System.out.println("로그인하세요");
		String Id=sc.next();
		String Pw=sc.next();
		성적 in=new 성적( 0, Id, Pw);
		if(Id.equals(Si)&&Pw.equals(Sp))
		{
		System.out.println("학생점수를 확인하세요");
		if(in.점수확인(point))	
			System.out.println(in.set점수(point));
		break;
		}
	}

	}
	}

