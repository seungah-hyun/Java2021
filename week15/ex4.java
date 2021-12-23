package week15;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		String what = new String("아브라카타브라");
		int where = what.indexOf("라");
		System.out.println(where);
		System.out.println(what.indexOf("라",where+1));
		System.out.println(what.substring(2,6));
		System.out.println(what.substring(2));
	}

}
