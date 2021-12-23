package week5;


public class static_review {
	static void myStaticMethod()
	{
		System.out.println("저는 부르기만 하면 나와요");
	}
	public void myNonStaticMethod()
	{
		System.out.println("저는 부른다고 나오지않아요");
		System.out.println("객체를 만들고 불러주세요");
	}
	
	
	
	public static void main(String[] args) 
	{
		myStaticMethod();
		static_review a= new static_review();
		a.myNonStaticMethod();
	}

}
