package ��ü����;

 class Animal{
		public void a() {
			System.out.println("hi");
		}
 }
class Dog extends Animal{		
		}			
class Fish extends Animal{
		}
	
	
public class �ۺ������̺�����Ʈ {	
	public static void main(String[] args) 
	{
		//�ν��Ͻ� ����
		Animal am= new Animal();		
		am.a();
		
		Dog d=new Dog();
		d.a();
		Fish f=new Fish();
		f.a();
		//private�� ��Ŭ���������� �Ұ��� default �ƹ��͵��ț������� ��Ű�� �ȿ����� ���� 
		//public ����Ŭ���� �ٸ�Ŭ���� �ٸ���Ű�� ��Ӱ��� 
		//private �� ���� Ŭ���������� ���� 
		//x �� ���� Ŭ���� �ٸ�Ŭ���� ���� ������ �ٸ� ��Ű�������� ����� �Ұ���
	}

}
