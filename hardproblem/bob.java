package hardproblem;
import java.util.Scanner;


	class SpongeBob
	{
		String name,character;
		public SpongeBob(String name,String character)
		{
			this.name=name;
			this.character=character;
		}
	
		public String getName()
		{
			return name;
		}
		public String getCharacter()
		{
			return character;
		}
	}
	
public class bob {	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String name,character;
		SpongeBob[]b;
		b=new SpongeBob[3];
		for(int i=0;i<b.length;i++)
		{	
		     System.out.print("이름 ");
			 name=sc.nextLine();
			 System.out.print("성격 ");
			 character= sc.nextLine();			 
			 b[i]=new SpongeBob(name,character);
			 System.out.println(name+"  "+character);			 			 
		}
		
		

	}

}
