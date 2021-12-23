package HashMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class hashamp {

	public static void main(String[] args) {
		HashMap <String,Integer>h=new HashMap<String,Integer>();
		
		h.put("»þ¶ö¶ó",77);
		h.put("¼ÒÃÔÇ³",88);
		h.put("ÁØÇö",99);
		
		System.out.println(h.size());
		
		Set<String> Keys=h.keySet();
		
		Iterator<String>it=Keys.iterator();
		
		while(it.hasNext())
		{
			String name=it.next();
			int score=h.get(name);
			System.out.println(name);
			System.out.println(score);
		}
		

	}

}
