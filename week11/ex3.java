package week11;

enum Season
{
��,����,����,�ܿ�	
}

public class ex3 {

	public static void main(String[] args) {
		Season s1= Season.����;
		Season s2=Season.�ܿ�;
		
		int where1=s1.compareTo(s2);
		System.out.println(where1);
		int where2=s2.compareTo(s1);
		System.out.println(where2);
		

	}

}
