package 객채2;
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
		System.out.println("수강신청 :"+name);
		System.out.println("수강신청 :"+point);
		System.out.println("수강신청 :"+teacher);
	}
		
}
public class 수강신청프로그램 {
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("수강신청을 해주세요");
		String name,point,teacher;

		
		//처음 과목등록				
			System.out.print("수강과목 :");
			name=sc.next();
			System.out.print("학점 :");
			point=sc.next();
			System.out.print("담당교수 :");
			teacher=sc.next();
		
		Memory m= new Memory(name,point,teacher);
		
		
		// 표현
		
		while(true)
		{
			System.out.println("<메뉴>\n입력 :1,보기 :2,그만 :3");
			int num=sc.nextInt();
			if(num==1)
			{
				System.out.print("수강과목 :");
				name=sc.next();
				System.out.print("학점 :");
				point=sc.next();
				System.out.print("담당교수 :");
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
