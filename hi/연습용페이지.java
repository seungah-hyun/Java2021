package hi;
import java.util.Scanner;
public class 연습용페이지 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		String a= sc.nextLine();
		String[]text=a.split(" ");
		for(int i =0;i<4;i++)
			{
			//text[i]=a.split(" ")[i];
			System.out.printf("%d. %s\n",i+1,text[i]);
			}		
	}

}
