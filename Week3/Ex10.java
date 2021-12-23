package Week3;

public class Ex10 {

	public static void main(String[] args) {
		//숫자 연산
		
				byte byteValue1 = 10;
				byte byteValue2 = 20;
				int sum1 = byteValue1 + byteValue2;   //컴파일 에러
				
				System.out.println(sum1);
				
				char charValue1 = 'A';
				char charValue2 = 1;
				char sum2 = charValue1 + charValue2;   //컴파일 에러
				
				System.out.println("유니코드=" + sum2);  // 유니코드=66 가 나오도록 수정
				System.out.println("출력문자=" + sum2);   //출력문자 = B 가 나오도록 수정
				
				int intValue3 = 10;
				int intValue4 = intValue3/4;
				System.out.println(intValue4);   //제대로 된 답 나오도록 수정
				
				
				
				int x = 1;
				int y = 2;
				double result =  x / y;

	}

}
