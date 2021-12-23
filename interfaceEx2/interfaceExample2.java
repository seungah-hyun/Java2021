package interfaceEx2;

interface Phoneinterface
{
	void Call();
	void receive();
	
}

interface Mobileinterface extends Phoneinterface
{
	void sendMail();
	void reciveMail();
}

interface Musicinterface
{
	void play();
	void stop();
}

class Computer
{
	public int Myadd(int a,int b)
	{
		return a+b;
	}
	
}
class Smartphone extends Computer implements Mobileinterface,Musicinterface
{

	@Override
	public void Call() {
		System.out.println("전화 걸기");
		
	}

	@Override
	public void receive() {
		System.out.println("전화 받기");
		
	}

	@Override
	public void play() {
		System.out.println("음악 듣기");
		
	}

	@Override
	public void stop() {
		System.out.println("음악 멈추기");
		
	}

	@Override
	public void sendMail() {
		
		System.out.println("메세지 보내기");
	}

	@Override
	public void reciveMail() {
		
		System.out.println("메세지 받기");
	}
	
}


public class interfaceExample2
{
	public static void main(String[] args)
	{
		Smartphone p=new Smartphone();
		p.Call();
		System.out.println(p.Myadd(5,7));
		p.stop();
		
	}
	
}