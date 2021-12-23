package 객체지향;

class Print{
	public  String delimiter="";
	public  void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public  void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}

	
}


public class no2클래스 {
//인스턴스
	
	public static void main(String[] args) {
		
		//인스턴스 생성
		Print p1=new Print();
		p1.delimiter ="----";
		p1.A();
		p1.A();
		Print p2=new Print();
		p2.delimiter="****";
		p2.B();
		p2.B();
		p1.A();
		p2.B(); 
		
		}

}
