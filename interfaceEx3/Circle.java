package interfaceEx3;

public class Circle implements Shape{

	int r;
	public Circle(int r)
	{
		this.r =r;
	}
	
	@Override
	public double getArea() {
		
		return r*r*3.14;
	}

	@Override
	public void draw() {
		System.out.println("원을 그립니다.");
		
	}

	@Override
	public double getArea1(int y, int x) {
		
		return 0;
	}
	

}
