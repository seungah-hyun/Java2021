package hardproblem;
import java.util.Scanner;
public class no5 {
	double num;
	String color;
	public double multi()
	{
		return  3.141592653589793* num * num;
	}
	public static void main(String[] args) 
	{
	
		Scanner sc= new Scanner(System.in);
		no5 test=new no5();
		test.num=sc.nextDouble();
		test.color=sc.next();
		double result =test.multi();
		
		System.out.println(result);
		System.out.println(test.color);
		

	}

}
