package hardproblem;
import java.util.Scanner;
public class no3  {
	String age;
	String name;
 

public static void main(String[] args) 
{  
	Scanner sc = new Scanner(System.in);  
	no3 test = new no3();
	System.out.print("Enter the name:");  
	test.name = sc.next();  
	System.out.print("Enter the age:");  
	test.age = sc.next(); 	
          	  
	System.out.println(test);  
	System.out.println("Name=>"+test.name+"and"+"Age+>"+test.age);
}  
	
  
}    
