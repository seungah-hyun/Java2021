package Arr;

import java.util.ArrayList;

public class Bmain {

	public static void main(String[] args) 
	{
		ArrayList <B>list =new ArrayList<B>();
		list.add(new B("����1","����1","�۾���1"));
		list.add(new B("����2","����2","�۾���2"));
		list.add(new B("����3","����3","�۾���3"));
		
		for(int i=0;i<list.size();i++)
		{
			B dummy=list.get(i);
			System.out.println(dummy.content);
			System.out.println(dummy.subject);
			System.out.println(dummy.writer);
		}

	}

}
