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
		
		no11 test =new no11("����","25","180");
		no11 test2=new no11("�达","15");
		no11 test3=new no11("�ھ�");
		no11 test4=new no11();
	
		System.out.println("�̸� "+test.name+"\n���� "+test.age+"\n�й� "+test.ID);
		System.out.println("�̸� "+test2.name+"\n���� "+test2.age+"\n�й� "+test2.ID);
		System.out.println("�̸� "+test3.name+"\n���� "+test3.age+"\n�й� "+test3.ID);
		System.out.println("�̸� "+test4.name+"\n���� "+test4.age+"\n�й� "+test4.ID);
	}

}
