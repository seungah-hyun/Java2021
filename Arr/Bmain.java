package Arr;

import java.util.ArrayList;

public class Bmain {

	public static void main(String[] args) 
	{
		ArrayList <B>list =new ArrayList<B>();
		list.add(new B("제목1","내용1","글쓴이1"));
		list.add(new B("제목2","내용2","글쓴이2"));
		list.add(new B("제목3","내용3","글쓴이3"));
		
		for(int i=0;i<list.size();i++)
		{
			B dummy=list.get(i);
			System.out.println(dummy.content);
			System.out.println(dummy.subject);
			System.out.println(dummy.writer);
		}

	}

}
