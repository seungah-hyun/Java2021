package week11;

enum Season
{
봄,여름,가을,겨울	
}

public class ex2 
{

	public static void main(String[] args) 
	{
		Season what =Season.여름;
		System.out.println(what);
		System.out.println(what.ordinal());
		Season what2=Season.valueOf("겨울");
		System.out.println(what2);


	}

}
