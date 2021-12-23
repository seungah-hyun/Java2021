package 공부용;

public class 겅브하긔 {

	public static void main(String[] args) 
	{
		for(int year = 2021; year<=2024; year++)
		{
			System.out.print(year + "년 1학기는");
			for(int first = 3; first<=6; first++)
				System.out.print(first + ", ");
			System.out.print(year + "년 2학기는");
			for(int second = 9; second<=12; second++)
			{
				if (year==2022)
					break;
				System.out.print(second + ", ");
				
			}	
		System.out.println();	
		}

		

	}

}
