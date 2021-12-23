package interfaceEx;

public class car implements vehicle{
	
	int gear;
	int speed=10;
	@Override
	public void changeGear(int a) {
		gear=a;
		
	}
	@Override
	public void speedup(int a) {
		speed+=a;
		
	}
	@Override
	public void speeddown(int a) {
		speed-=a;
		
	}

	


public void printnow()
{
	System.out.println("Car speed: "+speed +" gear: "+gear);
}
}
