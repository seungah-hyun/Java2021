package week15;

public class ex5 {

	public static void main(String[] args) {
		String what1 = new String("아브라");
		String what2 = new String("카타브라");
		String result1 = new String();
		result1 = what1.concat(what2);
		String result2 = what1+what2; 
		System.out.println(result1); 
		System.out.println(result2);

	}

}
