package interfaceEx4;

public class circle implements Shape{

	
	int r;
	public circle(int r)
	{
		this.r =r;
	}
	
	@Override
	public double getArea() {
		
		return r*r*PI;
	}

	@Override
	public void draw() {
		System.out.println("���� �׸��ϴ�.");
		
	}

	@Override
	public double getArea(int y, int x) {

		return 0;
	}
	

}
