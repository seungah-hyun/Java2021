package hardproblem;

public class no7 {

	String name;
	String age;
	public no7(String n,String a)
	{
		name =n;
		age = a;
				
	}
	public no7(String n)
	{
		name=n;
		age="¸ð¸§";
	}
	public no7()
	{
		this("none","none");
	}
	
	public static void main(String[] args) {
		no7 test=new no7("¼£¶ö¶ó ","23");
		no7 test2=new no7("WTF ");
		no7 test3=new no7();
		System.out.println(test.name+" "+test.age);
		System.out.println(test2.name+" "+test2.age);
		System.out.println(test3.name+" "+test3.age);
	}

}
