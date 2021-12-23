package week5;

public class Ex1 {

	public static void main(String[] args) {
		int a =3, b= 7;
		System.out.printf("a= %d, b= %d",a,b);
  	    System.out.println();
//		int temp;
//		temp = a ; //temp = 3 a= 3
//		a=b; // b= 7 a= 7
//		b=temp;
//		System.out.printf("a=%d. b=%d", a, b);
//		
        
  	    //비트연산자 XOR를 사용하는 방법

//      a= a^b;
 // 	    b = a^b;
 // 	    a = a^b;
  	    
  	    
  	    
  	 // System.out.printf("a= %d, b= %d",a,b);
  	    
  	    
  	    
  	    a ^=b;
  	    b^=a;
  	    a^=b;
  	  System.out.printf("a= %d, b= %d",a,b);
  	    
	}

}
