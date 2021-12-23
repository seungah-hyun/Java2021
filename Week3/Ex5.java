package Week3;

public class Ex5 {

	public static void main(String[] args) {
		float PI = 3.14F; // 4byte
		
		double PId= 3.14;   // 8 byte
 		
				System.out.println(PI);
		System.out.println(PId);
		
		float a = 0.123456789f;
		double b = 0.657421897218761324 ;
		System.out.println(a);
		System.out.println(b);
		
		int c = 80000;
		//int b = 8e4;
		double d = 8e4;
		float e = 8e4f;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		byte var1 = 1;
		byte var2 = 2;
		//int  sum = var1 + var2;
		byte sum = (byte)(var1 + var2);
		System.out.println(sum);
		
		//System.out.println(sum);
		
	}

}
