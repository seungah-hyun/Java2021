package interfaceEx;

public class interfaceEx1 {

	public static void main(String[] args) {
		bicycle b=new bicycle();
		b.changeGear(5);
		b.speedup(3);
		b.speeddown(2);
		b.printnow();
		car c= new car();
		c.changeGear(2);
		c.speedup(9);
		c.speeddown(3);
		c.printnow();
		
		
	}

}
