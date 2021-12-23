package week6;

public class Ex4 {

	public static void main(String[] args) {
		//2021년 1학기는 3456월 2학기는 9,10,11,12
		//2022년 1학기는 3456월 2학기는 9,10,11,12
		//2023년 1학기는 3456월 2학기는 9,10,11,12
		//2024년 1학기는 3456월 2학기는 9,10,11,12
		for(int year = 2021;year<2025;year++)
		{           
			for(int Semester1=3;Semester1<7;Semester1++)
				System.out.print(year+"년"+"1학기는"+Semester1+"월"+" ");	
			{
				for(int Semester2=9;Semester2<13;Semester2++)
					
					System.out.print(year+"년 2학기는"+Semester2+"월"+" ");
					System.out.println();
				
			}
			
			
		}
		
	}

}
