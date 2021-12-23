package Arr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Link {

	public static void main(String[] args) 
	{
		List<String> list =new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbbb");
		list.add("ccccc");
		list.add("dddddd");
		list.add("eeeeeee");
		System.out.println(list.size());
		String what= list.get(0);
		System.out.println(list.get(3));
		System.out.println(what);
		System.out.println(list.get(2));
		list.remove(2);
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		System.out.println("****************");
		
		Iterator<String>it=list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		int max=-1;
		int index=0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).length()>max)
			{
				max=list.get(i).length();
				index=i;
			}
			
		}
		if(max==list.get(index).length())
			System.out.println(list.get(index));
		

	}

}
