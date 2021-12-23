package 공부용;
import java.util.Scanner;
public class 정올문자열1형성평가7 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		String a= sc.nextLine();
		String[]text=a.split(" ");
		for(int i =0;i<text.length;i++)
			{
			System.out.printf("%d. %s\n",i+1,text[i]);	
			}
		
			
		}	
	

}
