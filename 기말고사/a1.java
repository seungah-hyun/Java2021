package 기말고사;
import java.util.Scanner;
abstract class Shopping {
    protected String name;
    protected int price = 10000;
    protected double discount = 0.2;

    public Shopping(String name) {
        this.name = name;
    }

    public double howmuch() {
        return price * (1 - discount);
    }
}

class TshirtShopping extends Shopping {

	public TshirtShopping(String name) {
		super(name);
		
	}
	public double howmuch() {
        return (price * (1 - discount))-1000;
    }
}
class PantsShopping extends Shopping {

	public PantsShopping(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public double howmuch() {
        return (price * (1 - discount))-2000;
    }
	
}
class ShoesShopping extends Shopping {

	public ShoesShopping(String name) {
		super(name);
		
	}
	public double howmuch() {
        return (price * (1 - discount))-1500;
    }
	
	
}
public class a1{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T,P,S;
	T=sc.nextInt();
	P=sc.nextInt();
	S=sc.nextInt();
	
	TshirtShopping Ts= new TshirtShopping("T");
	PantsShopping Ps=new PantsShopping("P");
	ShoesShopping Ss=new ShoesShopping("S");
	
	System.out.println(T*Ts.howmuch()+P*Ps.howmuch()+S*Ss.howmuch()+"원");
	
}
}