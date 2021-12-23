package Week3;

public class Ex8 {

	public static void main(String[] args) {
		String a ="10";
		byte changtobyte = Byte.parseByte(a) ;
		System.out.println(changtobyte);
		
		int changetoint  = Integer.parseInt(a);
		System.out.println(changetoint);
			
		String b= "1.234";
		double changetoDouble = Double.parseDouble(b);
		System.out.println(changetoDouble);
		System.out.println(b);

	}

}
