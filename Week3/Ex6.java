package Week3;

public class Ex6 {

	public static void main(String[] args) {
		//byte a = 10 ; �����ſ� ū�ſ��ִ°ǵ����� �׹ݴ�� �ȵ�
		//int b = a;
		int a = 10 ;
		byte b = (byte)a ; // ���º�ȭ�� �����ϴ�.
		
	
		System.out.println(a);
		System.out.println(b);
		
		
		long c = a;
		
		System.out.println(c);
		
		float d = 3.1234f;
		double e = d;
		System.out.println(e);
		
		int f = 44032;// <-�����ڵ�� '��'
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
