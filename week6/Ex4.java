package week6;

public class Ex4 {

	public static void main(String[] args) {
		//2021�� 1�б�� 3456�� 2�б�� 9,10,11,12
		//2022�� 1�б�� 3456�� 2�б�� 9,10,11,12
		//2023�� 1�б�� 3456�� 2�б�� 9,10,11,12
		//2024�� 1�б�� 3456�� 2�б�� 9,10,11,12
		for(int year = 2021;year<2025;year++)
		{           
			for(int Semester1=3;Semester1<7;Semester1++)
				System.out.print(year+"��"+"1�б��"+Semester1+"��"+" ");	
			{
				for(int Semester2=9;Semester2<13;Semester2++)
					
					System.out.print(year+"�� 2�б��"+Semester2+"��"+" ");
					System.out.println();
				
			}
			
			
		}
		
	}

}
