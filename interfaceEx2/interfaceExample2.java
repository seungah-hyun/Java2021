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
		System.out.println("��ȭ �ɱ�");
		
	}

	@Override
	public void receive() {
		System.out.println("��ȭ �ޱ�");
		
	}

	@Override
	public void play() {
		System.out.println("���� ���");
		
	}

	@Override
	public void stop() {
		System.out.println("���� ���߱�");
		
	}

	@Override
	public void sendMail() {
		
		System.out.println("�޼��� ������");
	}

	@Override
	public void reciveMail() {
		
		System.out.println("�޼��� �ޱ�");
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