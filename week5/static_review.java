package week5;


public class static_review {
	static void myStaticMethod()
	{
		System.out.println("���� �θ��⸸ �ϸ� ���Ϳ�");
	}
	public void myNonStaticMethod()
	{
		System.out.println("���� �θ��ٰ� �������ʾƿ�");
		System.out.println("��ü�� ����� �ҷ��ּ���");
	}
	
	
	
	public static void main(String[] args) 
	{
		myStaticMethod();
		static_review a= new static_review();
		a.myNonStaticMethod();
	}

}
