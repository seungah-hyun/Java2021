package interfaceEx4;

public class interfaceEx4 {

	public static void main(String[] args)
	{
		
		Shape[]s=new Shape[3];
		
		
		s[0]=new circle(5);
		s[1]=new rect(3,4);
		s[2]=new tri(2,5);
		
		for(int i=0;i<3;i++)
			{
			System.out.println(s[i].getArea());
			s[i].draw();
			}
		
	}
}
