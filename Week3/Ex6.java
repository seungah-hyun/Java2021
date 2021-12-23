package Week3;

public class Ex6 {

	public static void main(String[] args) {
		//byte a = 10 ; 작은거에 큰거에넣는건되지만 그반대는 안됨
		//int b = a;
		int a = 10 ;
		byte b = (byte)a ; // 형태변화는 위험하다.
		
	
		System.out.println(a);
		System.out.println(b);
		
		
		long c = a;
		
		System.out.println(c);
		
		float d = 3.1234f;
		double e = d;
		System.out.println(e);
		
		int f = 44032;// <-유니코드는 '가'
		char g =(char)f;
		System.out.println(g);
		
		long h =3 ;
		int i = 2;
		 int ans =(int)h+i;
		//long ans = h+i;
		System.out.println(ans);
		
		int x=5;
		int y=2;
		double div = (double)x/y ;
		System.out.println(div);
		
		char qt = 'B';
		System.out.println(qt);
			

	}

}
