package week15;

public class ex5 {

	public static void main(String[] args) {
		String what1 = new String("�ƺ��");
		String what2 = new String("īŸ���");
		String result1 = new String();
		result1 = what1.concat(what2);
		String result2 = what1+what2; 
		System.out.println(result1); 
		System.out.println(result2);

	}

}
