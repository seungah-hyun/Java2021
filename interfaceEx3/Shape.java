package interfaceEx3;

public interface Shape
{
	final double PI=3.14;
	double getArea();
	void draw();
	default void redraw()
	{
		System.out.println("다시 도전");
		draw();
	}
	double getArea1(int y,int x);
	
	
	
	
	
	
}