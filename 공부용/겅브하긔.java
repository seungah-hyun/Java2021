package ���ο�;

public class �Ϻ��ϱ� {

	public static void main(String[] args) 
	{
		for(int year = 2021; year<=2024; year++)
		{
			System.out.print(year + "�� 1�б��");
			for(int first = 3; first<=6; first++)
				System.out.print(first + ", ");
			System.out.print(year + "�� 2�б��");
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
