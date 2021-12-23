package hardproblem;
import java.util.Scanner;
public class no9 {
	
	String firstName;
	String lastName;
	double salary;
	public no9(String a,String b,double c)
	{
		firstName=a;
		lastName=b;
		salary=c;
		
	}	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first name:");
		String a=sc.next();
		System.out.print("Enter last name:");
		String b=sc.next();
		System.out.print("Enter montly salary:");
		double c= sc.nextDouble();
		
		no9 test=new no9(a,b,c);
		
		
		System.out.println("First name: "+test.firstName);
		System.out.println("last name: "+test.lastName);
		System.out.println("Salary: "+test.salary);
		

	}

}
