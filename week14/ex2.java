package week14;

public class ex2 {

	public static void main(String[] args) {
		int a=3;
		int b=7;
		System.out.println(a);
		System.out.println(b);
		a^=b;
		b^=a;
		a^=b;
		System.out.println(a);
		System.out.println(b);
		

	}

}
