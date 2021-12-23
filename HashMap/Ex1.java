package HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap <String,Integer>h=new HashMap<String,Integer>();
		
		h.put("떡볶이",1000);
		h.put("라면",2000);
		h.put("짜장면",3000);
		h.put("제육볶음",4000);
		
		Set<String> Keys=h.keySet();
		
		
			String name="";
			
		while(true)
		{
			name=sc.next();
			Integer price=h.get(name);
			if(name.equals("stop"))
				break;
			else if(price!=null)
				System.out.println(price+"원입니다.");
			else
				System.out.println("없는디유!");
			
		
		}

	}

}
