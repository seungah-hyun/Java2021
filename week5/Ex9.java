package week5;

public class Ex9 {

	public static void main(String[] args) {
		//0.0<= Math.random() < 1.0 �����߻�
        //0.0<= (int)Math.random()*10<10 0���� 9���� ������ ������������������.

	//int Lotto = (int)(Math.random()*45)+1;
	
	//System.out.println(Lotto);
	
		int dice = (int)(Math.random()*6)+1;
		System.out.println(dice);
		if (dice==1)
			System.out.println("1�Դϴ�.");
		if (dice==2)
			System.out.println("2�Դϴ�.");
		if (dice==3)
			System.out.println("3�Դϴ�.");
		if (dice==4)
			System.out.println("4�Դϴ�.");
		if (dice==5)
			System.out.println("5�Դϴ�.");
		if (dice==6)
			System.out.println("6�Դϴ�.");
		
		
	}

}
