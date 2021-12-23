package °´Ã¤3;
interface Firstinterface
{
	public void methodA();	
}
interface Sencondinterface
{
	public void methodB();
}
class dummy implements Firstinterface,Sencondinterface
{
	@Override
	public void methodB() {
		System.out.println("BB");
	}
	@Override
	public void methodA() {
		System.out.println("AA");
	}
}

public class no2 {

	public static void main(String[] args) 
	{
		dummy d=new dummy();
		d.methodB();
		d.methodA();

	}

}
