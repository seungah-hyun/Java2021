package hardproblem;
import java.util.Scanner;
public class no6 {
	int x;
	int y;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		no6 where=new no6();
		System.out.print("Enter x coordinate: ");
		where.x=sc.nextInt();
		System.out.print("Enter y coordinate: ");
		where.y=sc.nextInt();
		
		if(where.x>0 && where.y>0)
		{System.out.println("Quadrant 1");}
		if(where.x<0 && where.y>0)
		{System.out.println("Quadrant 2");}
		if(where.x<0 && where.y<0)
		{System.out.println("Quadrant 3");}
		if(where.x>0 && where.y<0)
		{System.out.println("Quadrant 4");}
			

	}

}
