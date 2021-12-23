package beakjoon;
import java.util.Scanner;
class Tri{

	private int a1,a2,a3;
	public Tri(int a1,int a2,int a3)
	{
		this.a1=a1;
		this.a2=a2;
		this.a3=a3;
	}
	public String toString()
	{
		return "a1= "+a1+"a2= "+a2+"a3= "+a3;
	}
	public boolean equals(Tri p)
	{
		if(a1*a1+a2*a2==a3*a3||a2*a2+a3*a3==a1*a1||a1*a1*a3*a3==a2*a2)
			return true;
		else
			return false;
	}
}
public class Trr{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			Tri r1=new Tri(a,b,c);
			if(a==0&&b==0&&c==0)
				break;
			if(r1.equals(r1))
			
				System.out.println("right");
		
			else
				System.out.println("wrong");
		}
		
	}

}
