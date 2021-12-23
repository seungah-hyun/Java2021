package week5;

public class Ex8 {

	public static void main(String[] args) 
	{
		int score =100;
		if (score>=90)
			{System.out.println("점수가 90 이상입니다.");
		    System.out.println("학점 A입니다.");}
		else if(score>=80)
		{System.out.println("점수가 80 이상입니다.");
	    System.out.println("학점 B입니다.");
		}
		else if(score>=70)
	    {
	    System.out.println("점수가 70 이상입니다.");
	    System.out.println("학점 C입니다.");
	    }
		else 
	    {
	    System.out.println("점수가 70 이하입니다.");
	    System.out.println("학점 F입니다.");
	    }

	}

}
