package week15;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		String what = new String("�ƺ��īŸ���");
		int where = what.indexOf("��");
		System.out.println(where);
		System.out.println(what.indexOf("��",where+1));
		System.out.println(what.substring(2,6));
		System.out.println(what.substring(2));
	}

}
