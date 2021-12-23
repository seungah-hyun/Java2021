package Week4;

public class Ex8 {

	public static void main(String[] args) {
		int x =-10;
		System.out.println(x);
		System.out.println(-x);
		System.out.println(~x+1);
		
		int y = 5 ;
		int add1 = y++;// y=y+1, 2.add=y
		System.out.println(add1);
		System.out.println(y);
		
		int z =7 ;
		int add2 = z++;//1. add2 =z ,z=z+1
		System.out.println("add2=" +add2);
		System.out.println(z);
		
		int minus2 = z--;
		System.out.println("minus2 =" +minus2);
		System.out.println(z);
		
		
		
	}

}
