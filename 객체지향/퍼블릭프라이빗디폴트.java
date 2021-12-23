package 객체지향;

 class Animal{
		public void a() {
			System.out.println("hi");
		}
 }
class Dog extends Animal{		
		}			
class Fish extends Animal{
		}
	
	
public class 퍼블릭프라이빗디폴트 {	
	public static void main(String[] args) 
	{
		//인스턴스 생성
		Animal am= new Animal();		
		am.a();
		
		Dog d=new Dog();
		d.a();
		Fish f=new Fish();
		f.a();
		//private는 한클래스에서만 불가능 default 아무것도안썻을때는 패키지 안에서만 가능 
		//public 같은클래서 다른클래스 다른패키지 상속가능 
		//private 는 같은 클래스에서만 가능 
		//x 는 같은 클래스 다른클래스 가능 하지만 다른 패키지에서는 상속은 불가능
	}

}
