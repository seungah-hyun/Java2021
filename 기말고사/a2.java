package �⸻���;
import java.util.*;

public class a2 {
	
	public static void main(String[] args) {
		HashMap <String,String>h=new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);		
		System.out.println("�ܾ �Է��ϼ���");
		while(true)
		{
			String eng =sc.nextLine();
			String kor =sc.nextLine();
			h.put(eng, kor);
			
			System.out.println("�Է������� stop,�� ��� �Ͻ÷��� �ƹ�Ű�� �����ּ���");
			String stop=sc.nextLine();
			if(stop.equals("stop"))
				break;
		}
		Set<String> Keys=h.keySet();		
		Iterator<String>it=Keys.iterator();
		//�ܾ�ã��
		while(true)
		{
		System.out.println("�ܾ ã���ǰŸ� 1�� �ƴϸ� 2���� �����ּ���");
		int Num=sc.nextInt();
		if(Num==1)
		{
			System.out.println("�ܾ �Է��ϼ���");
			String name=sc.next();
			if(name.equals(it.next()))
				System.out.println(name+" "+h.get(name));
			else
			{
				System.out.println("���� �����ʽ��ϴ�.");
			}
		}
		else
		{
			System.out.println("�ܾ ã�°��� �׸��Ӵϴ�.");
			break;
		}		
		}
		String []arr=new String[h.size()];
		String []arr2=new String[h.size()];
		 for(int i=0;i<h.size();i++)
		 {
			 arr[i]=it.next();
			 arr2[i]=h.get(arr[i]);
		 }
		 for(int i=h.size()-1;i>=0;i--)
		 {
			 System.out.print(arr[i]+" ");
		 }
		 for(int i=h.size()-1;i>=0;i--)
		 {
			 System.out.print(" "+arr2[i]+" ");
		 }
	}

}
