package week5;

public class Ex9 {

	public static void main(String[] args) {
		//0.0<= Math.random() < 1.0 난수발생
        //0.0<= (int)Math.random()*10<10 0부터 9까지 정수인 난수값을가질수있음.

	//int Lotto = (int)(Math.random()*45)+1;
	
	//System.out.println(Lotto);
	
		int dice = (int)(Math.random()*6)+1;
		System.out.println(dice);
		if (dice==1)
			System.out.println("1입니다.");
		if (dice==2)
			System.out.println("2입니다.");
		if (dice==3)
			System.out.println("3입니다.");
		if (dice==4)
			System.out.println("4입니다.");
		if (dice==5)
			System.out.println("5입니다.");
		if (dice==6)
			System.out.println("6입니다.");
		
		
	}

}
