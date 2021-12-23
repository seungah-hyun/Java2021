package week5;

public class Ex10 {

	public static void main(String[] args) {
		int dice = (int)(Math.random()*6)+1;
		System.out.println(dice);
		
		switch(dice)
		{
		case 1 :
			System.out.println("1입니다.");
			break;
		case 2 :
			System.out.println("2입니다.");
			break;
		case 3 :
			System.out.println("3입니다.");
			break;
		case 4 :
			System.out.println("4입니다.");
			break;
		case 5 :
			System.out.println("5입니다.");
			break;
		case 6 :
			System.out.println("6입니다.");
			break;
		}
	
	
	}

}
