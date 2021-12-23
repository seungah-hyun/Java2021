package Arraylist;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Iterator;
public class Friendsmain 
{
	private Scanner sc = new Scanner(System.in);
	
	private ArrayList<Friend> Ar=new ArrayList<Friend>();
	
	private void input()
	{
		System.out.println("이름,전공,나이,키를 ',' 구분자로 하여 입력하시오.");
		for(int i=0;i<3;i++)
		{
		String text=sc.nextLine();
		StringTokenizer st=new StringTokenizer(text,",");
		String name=st.nextToken().trim();
		String major =st.nextToken().trim();
		int age=Integer.parseInt(st.nextToken().trim());
		double height=Double.parseDouble((st.nextToken().trim()));
		
		Friend f=new Friend(name,major,age,height);
		
		Ar.add(f);
		}
		}
	
	private void printAll()
	{
		
		Iterator <Friend> it=Ar.iterator();
		while(it.hasNext())
		{
			Friend f= it.next();
			System.out.println(f.getName()+"\t"+f.getMajor()+"\t"+f.getAge()+"\t"+f.getHeight());
		}
	}
	private void Query()
	{
		System.out.print("이름 :");
		String name=sc.nextLine();
		for(int i=0;i<Ar.size();i++)
		{
			Friend f=Ar.get(i);
			if(f.getName().equals(name))
			{			
				System.out.println(f.getName()+"\t"+f.getMajor()+"\t"+f.getAge()+"\t"+f.getHeight());
				break;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		
		Friendsmain here=new Friendsmain();
		here.input();
		here.printAll();
		here.Query();
		
	}

}
