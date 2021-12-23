package 객채2;
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
			System.out.print("직업명 :"+List[i].name+"\n이동거리 :"+List[i].q+"\n");
			System.out.print("공격기술1 :"+List[i].w+"\n공격기술2 :"+List[i].e+"\n방어기술1 :"+List[i].r+"\n");
			
		
		}
		
	}
	static void run() {
		String name,q,w,e,r;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("등록은 1번 / 등록된 챔피언 보기는 2번 /3번은 종료합니다.");
		System.out.println("등록이 안되었으면 1번을 눌러주세요");
		int sign=sc.nextInt();
		if(sign==1)
			{
			System.out.print("몇명의 직업을 등록하실건가요?");
			int num=sc.nextInt();
			
			System.out.println("등록하실 직업의 이름과 이동거리및 스킬을 적어주세요");
			List=new Champhion[num];
			for(int i=0;i<num;i++)
				{	
					System.out.print("직업 :");		
					name=sc.next();
					System.out.print("이동거리 :");
					q=sc.next();
					System.out.print("공격기술1 :");
					w=sc.next();
					System.out.print("공격기술2 :");
					e=sc.next();
					System.out.print("방어기술1 :");
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
			System.out.println("기존에 존재하는 파일은 초기화후 종료합니다.");
			
			break;
			}
		else
		{
		System.out.println("잘못된번호니 다시입력해주세요");
		}
					
	}
}	
}		
public class LoL {
	
	public static void main(String[] args) {
			
					Champhion.run();
	}

}
