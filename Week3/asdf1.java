package Week3;

public class asdf1 {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int sum1 = byteValue1 + byteValue2;   //컴파일 에러
		
		System.out.println(sum1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int sum2 = (charValue1 + charValue2);   //컴파일 에러
		
		System.out.println("유니코드=" + sum2);  // 유니코드=66 가 나오도록 수정
		
		char charValue3 = 'A';
		char charValue4 = 1;
		char sum3 = (char)(charValue1 + charValue2);
		
		System.out.println("출력문자=" + sum3);   //출력문자 = B 가 나오도록 수정

		
		int intValue5 = 10;
		float intValue6 = intValue5 / 4f;
		System.out.println(intValue6);   //제대로 된 답 나오도록 수정
		System.out.println();
		
		int x = 1;
		int y = 2;
		 double result  = (double)x/y ;
		 
		System.out.println(result);//제대로 된 답 나오도록 수정
		
		
		
		
	}

}
