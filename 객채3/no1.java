package ��ä3;

interface Animal
{
	public void animalSound();
	public void sleep();
	
}
class pig implements Animal
{
	
	@Override
	public void animalSound() 
	{
		System.out.println("�ܲ�");
	}
	@Override
	public void sleep()
	{
		System.out.println("����");
	}
}

public class no1 {

	public static void main(String[] args) 
	{
	pig p=new pig();
	p.animalSound();
	p.sleep();

	}

}
