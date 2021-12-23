package 기말고사;
import java.util.*;

public class a2 {
	
	public static void main(String[] args) {
		HashMap <String,String>h=new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);		
		System.out.println("단어를 입력하세요");
		while(true)
		{
			String eng =sc.nextLine();
			String kor =sc.nextLine();
			h.put(eng, kor);
			
			System.out.println("입력을멈춤 stop,더 등록 하시려면 아무키나 눌러주세요");
			String stop=sc.nextLine();
			if(stop.equals("stop"))
				break;
		}
		Set<String> Keys=h.keySet();		
		Iterator<String>it=Keys.iterator();
		//단어찾기
		while(true)
		{
		System.out.println("단어를 찾으실거면 1번 아니면 2번을 눌러주세요");
		int Num=sc.nextInt();
		if(Num==1)
		{
			System.out.println("단어를 입력하세요");
			String name=sc.next();
			if(name.equals(it.next()))
				System.out.println(name+" "+h.get(name));
			else
			{
				System.out.println("존재 하지않습니다.");
			}
		}
		else
		{
			System.out.println("단어를 찾는것을 그만둡니다.");
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
