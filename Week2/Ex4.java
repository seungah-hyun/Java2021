package Week2;
class Parent{
	public String nation;
	public Parent() {
		this("���ѹα�");
		System.out.println("Parent() call");
	}
	public Parent(String nation) {
		this.nation=nation;
		System.out.println(nation+"Paren(String nation) call");
	}
}
class Child extends Parent{
	private String name;
	public Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	public Child(String name) {
		this.name=name;
		System.out.println(name+"Child(String name) call");
	}
}

public class Ex4 {

	public static void main(String[] args) {
		Child child=new Child();

	}

}
