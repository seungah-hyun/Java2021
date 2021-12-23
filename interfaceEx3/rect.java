package interfaceEx3;

public class rect implements Shape
{
	int y,x;
	
	public rect(int y,int x)
	{
		this.y=y;
		this.x=x;
	}
	
	@Override
	public double getArea1(int y,int x) {
		
		return y*x;
	}

	@Override
	public void draw() {
		System.out.println("사각형을 그립니다.");
		
	}

	@Override
	public double getArea() {
		
		return 0;
	}

}
