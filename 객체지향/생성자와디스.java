package 객체지향;
class Print1{
	public String delimiter="";
	public Print1(String delimiter) 
	{
		this.delimiter=delimiter;
	}
	//this 는 인스턴스 를 가르키는 용어이다 
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public  void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}

}

public class 생성자와디스 {

	public static void main(String[] args) {
		Print1 p1= new Print1("____");
		p1.A();
		p1.A();
		Print1 p2= new Print1("****");
		p2.B();
		p2.B();
		p1.A();
		p2.B();

	}

}
