package interfaceEx4;

public class rect implements Shape{
int y,x;
	
	public rect(int y,int x)
	{
		this.y=y;
		this.x=x;
	}

	@Override
	public void draw() {
		System.out.println("�簢���� �׸��ϴ�.");
		
	}

	
	@Override
	public double getArea(int y,int x) {
		
		return y*x;
	}

	@Override
	public double getArea() {
		
		return y*x;
	}
}
