package 중간고사2;
import java.util.Scanner;
class card{
	static card[]List;
	String name;
	
	public card(String name) {
		this.name=name;		
	}
	static void print() {
		Scanner sc= new Scanner(System.in);
		System.out.print("CN1님 카드를 입력하세요");
		int CN1=sc.nextInt();
		System.out.print("CN2님 카드를 입력하세요");
		int CN2=sc.nextInt();
		
		for(int i=1;i<=13;i++)
		{	
			if(CN1>CN2)
			{
				System.out.println("CN1 의승리입니다. 카드는 "+List[CN1].name);
				break;
			}
			else
			{
				System.out.println("CN2 의승리입니다.카드는 "+List[CN2].name);
				break;
			}
			}
	}
	static void run() {
		Scanner sc= new Scanner(System.in);
		String name;
		List=new card[14];
		System.out.println("카드 이름을 랭크가 낮은순대로 입력해주세요");
		for(int i=1;i<=13;i++)
		{
			
			name=sc.next();
			List[i]=new card(name);
		}
		card.print();
	}
}
public class no1 {

	public static void main(String[] args) {
		
		card.run();
	}

}
