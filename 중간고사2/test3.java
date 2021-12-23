package 중간고사2;
class car1 
{ 
int cc; 
int chairs;
String color2;
public int getCc() { return cc; }//a
public void setCc(int cc) { this.cc = cc; }
}

class car2 extends car1
{ 
private int color;
public int getColor() { return color; }
public void setColor(String color2) { this.color2=color2; }

}

class car3 extends car2
{ 
 
public void ChangeCc(int n) { cc = n; }
}


public class test3 {

	public static void main(String[] args) {

		
	

	}

}
