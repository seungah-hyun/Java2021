package week5;

public class Ex7 {

	public static void main(String[] args) {
		int score = 85 ;
		//char grade =(score > 90)? 'A':'B'; // Á¶°Ç? Âü : °ÅÁþ 
//		char grade;
//		if(score>90)
//			grade='A';
//		else
//			grade='B';
		char grade =(score > 90)? 'A' : ((score > 80)? 'B':'C') ;   
		
		System.out.println(grade);
			

	}

}
