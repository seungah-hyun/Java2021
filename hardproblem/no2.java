package hardproblem;
import java.util.Scanner;
public class no2 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int number =sc.nextInt();
		int []txt=new int[number];
		int temp1=-1;
		int temp2=-1;
		int box1=0;
		int box2=0;
		for(int i=0; i<number;i++)
		{
			 txt[i]=sc.nextInt();			 
		}
		for(int i=0; i<number;i++)
		{
			 if(txt[i]>temp1)
			 {
				 temp1=txt[i];
				 box1=i;
			 }
			 if(txt[8-i]>temp2)
			 {
				 temp2=txt[8-i];
				 box2=8-i;
			 }
			 
			 
		}
		System.out.println(box2-box1);

	}

}
