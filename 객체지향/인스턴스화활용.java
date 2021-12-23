package 객체지향;
class AC1{
public  double valueofsupply;
	
	public static double vatRat=0.1;
	public AC1(double valueofsupply)
	{
		this.valueofsupply=valueofsupply;
	}	
	public  double getVat() {
		return valueofsupply*vatRat;
	}
	public  double getTotal(){
		return valueofsupply+getVat();
	}
	
	}
public class 인스턴스화활용 {

	public static void main(String[] args) {
		AC1 ac=new AC1(10000.0);
		
		System.out.println("Value of supply :" + ac.valueofsupply);
		System.out.println("VAT :"+ac.getVat());
		System.out.println("Total :"+ac.getTotal());
		
		AC1 ac2=new AC1(20000.0);
		
		System.out.println("Value of supply :" + ac2.valueofsupply);
		System.out.println("VAT :"+ac2.getVat());
		System.out.println("Total :"+ac2.getTotal());
		
	}

}
