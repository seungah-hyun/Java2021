package interfaceEx4;

public class tri implements Shape{
int y,x;
	
	public tri(int y,int x)
	{
		this.y=y;
		this.x=x;
	}

	@Override
	public void draw() {
		System.out.println("삼각형을 그립니다.");
		
	}

	@Override
	public double getArea(int y,int x) {
		
		return y*x/2;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return y*x/2;
	}
}
	

