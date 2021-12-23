package 객체지향;
class Foo{
	public static String classvar=" i`m class var";
	public String instanceVar=" i instancevar";
	public static void classmethod()  {
	//메소드생성
		System.out.println(classvar);//ok
	// 	System.out.println(instenseVar);//error
	}
	public void intanceMethod()
	{
		System.out.println(classvar);//ok
		System.out.println(instanceVar);//error
	}
}



public class 스테틱 {

	public static void main(String[] args) {
		System.out.println(Foo.classvar);//Ok
	//	System.out.println(Foo.instanceVar);//error

		Foo.classmethod();//ok
	//	Foo.instenceMethod();//error
		
		Foo f1=new Foo();
		f1.intanceMethod();
		f1.classmethod();//error
		Foo f2=new Foo();
		System.out.println(f1.classvar); //i classvar
		System.out.println(f1.instanceVar);// i instancevar
		
		f1.classvar="change by f1";
		System.out.println(Foo.classvar);// change by f1
		System.out.println(f2.classvar);// change by f1
		
		f1.instanceVar="change by f1";
		System.out.println(f1.instanceVar);//change ny f1
		System.out.println(f2.instanceVar);// i instancevar
		
	}

}
