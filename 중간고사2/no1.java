package �߰����2;
import java.util.Scanner;
class card{
	static card[]List;
	String name;
	
	public card(String name) {
		this.name=name;		
	}
	static void print() {
		Scanner sc= new Scanner(System.in);
		System.out.print("CN1�� ī�带 �Է��ϼ���");
		int CN1=sc.nextInt();
		System.out.print("CN2�� ī�带 �Է��ϼ���");
		int CN2=sc.nextInt();
		
		for(int i=1;i<=13;i++)
		{	
			if(CN1>CN2)
			{
				System.out.println("CN1 �ǽ¸��Դϴ�. ī��� "+List[CN1].name);
				break;
			}
			else
			{
				System.out.println("CN2 �ǽ¸��Դϴ�.ī��� "+List[CN2].name);
				break;
			}
			}
	}
	static void run() {
		Scanner sc= new Scanner(System.in);
		String name;
		List=new card[14];
		System.out.println("ī�� �̸��� ��ũ�� ��������� �Է����ּ���");
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
