package Week12;

public class Main {

	public static void main(String[] args) {
		int[] myNumbers = {1, 2, 3};
		try {

		System.out.println(myNumbers[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{ 
			System.out.println("���ڸ� �ٽ��Է����ּ���");
			
		}
		
	}


	

}
