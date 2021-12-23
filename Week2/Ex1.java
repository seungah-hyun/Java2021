package Week2;
import java.util.Scanner;
class qua{
	int x,y;
	public qua(int x, int y) {
		this.x=x;this.y=y;
	}
	void output() {
		if(x>0 && y>0)
		{System.out.println("Quadrant 1");}
		if(x<0 && y>0)
		{System.out.println("Quadrant 2");}
		if(x<0 && y<0)
		{System.out.println("Quadrant 3");}
		if(x>0 && y<0)
		{System.out.println("Quadrant 4");}
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.print("Enter x coordinate: ");
		x=sc.nextInt();
		System.out.print("Enter y coordinate: ");
		y=sc.nextInt();
		qua q=new qua(x,y);
		q.output();
		
	}

}
