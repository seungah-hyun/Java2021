package hardproblem;

public class no11 {

	String name;
	String age;
	String ID;
	public no11(String a,String b,String c)
	{
		name=a;age=b;ID=c;
	}
	public no11(String a,String b)
	{
		name=a;age=b;ID="??";
	}
	public no11(String a)
	{
		name=a;age="?";ID="?";
	}
	public no11()
	{
		this("none","none","none");
	}
	public static void main(String[] args) 
	{
		
		no11 test =new no11("현씨","25","180");
		no11 test2=new no11("김씨","15");
		no11 test3=new no11("박씨");
		no11 test4=new no11();
	
		System.out.println("이름 "+test.name+"\n나이 "+test.age+"\n학번 "+test.ID);
		System.out.println("이름 "+test2.name+"\n나이 "+test2.age+"\n학번 "+test2.ID);
		System.out.println("이름 "+test3.name+"\n나이 "+test3.age+"\n학번 "+test3.ID);
		System.out.println("이름 "+test4.name+"\n나이 "+test4.age+"\n학번 "+test4.ID);
	}

}
