package HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap <String,Integer>h=new HashMap<String,Integer>();
		
		h.put("������",1000);
		h.put("���",2000);
		h.put("¥���",3000);
		h.put("��������",4000);
		
		Set<String> Keys=h.keySet();
		
		
			String name="";
			
		while(true)
		{
			name=sc.next();
			Integer price=h.get(name);
			if(name.equals("stop"))
				break;
			else if(price!=null)
				System.out.println(price+"���Դϴ�.");
			else
				System.out.println("���µ���!");
			
		
		}

	}

}
