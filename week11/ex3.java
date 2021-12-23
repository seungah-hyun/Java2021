package week11;

enum Season
{
봄,여름,가을,겨울	
}

public class ex3 {

	public static void main(String[] args) {
		Season s1= Season.여름;
		Season s2=Season.겨울;
		
		int where1=s1.compareTo(s2);
		System.out.println(where1);
		int where2=s2.compareTo(s1);
		System.out.println(where2);
		

	}

}
