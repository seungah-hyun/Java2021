package 객체지향;
class AC{
public static double valueofsupply;
	
	public static double vatRat=0.1;
	
	public static double getVat() {
		return valueofsupply*vatRat;
	}
	public static double getTotal(){
		return valueofsupply+getVat();
	}
	
	}
public class 메소드활용 {
	//클래스화
	
	public static void main(String[] args) {
		AC.valueofsupply=10000.0;
		System.out.println("Value of supply :" + AC.valueofsupply);
		System.out.println("VAT :"+AC.getVat());
		System.out.println("Total :"+AC.getTotal());
		

	}

}
