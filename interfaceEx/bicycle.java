package interfaceEx;

public class bicycle implements vehicle{
	
	int gear;
	int speed=5;
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
	System.out.println("bicycle speed: "+speed +" gear: "+gear);
}

}
