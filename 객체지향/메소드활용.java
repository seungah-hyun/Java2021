package ��ü����;
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
public class �޼ҵ�Ȱ�� {
	//Ŭ����ȭ
	
	public static void main(String[] args) {
		AC.valueofsupply=10000.0;
		System.out.println("Value of supply :" + AC.valueofsupply);
		System.out.println("VAT :"+AC.getVat());
		System.out.println("Total :"+AC.getTotal());
		

	}

}
