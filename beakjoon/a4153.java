package beakjoon;
import java.util.Scanner;
public class a4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		while (true) {
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
			if (x == 0 && y == 0 && z == 0)
				break;
			if ((Math.pow(x, 2) + Math.pow(y, 2)) == Math.pow(z, 2)
					|| (Math.pow(x, 2) + Math.pow(z, 2)) == Math.pow(y, 2)
					|| (Math.pow(z, 2) + Math.pow(y, 2)) == Math.pow(x, 2))
				System.out.println("right");
			else
				System.out.println("wrong");

		}

	}
}
