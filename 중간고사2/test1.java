package 중간고사2;
class Iammom{
	public void count() {
		System.out.println(0);
	}
}
class test extends Iammom{
	public void count() {
		super.count();
		System.out.println(1);
	}
}
public class test1 {

	public static void main(String[] args) {
		Iammom a=new test();
		a.count();

	}

}
