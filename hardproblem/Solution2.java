package hardproblem;

class Arithmetic
{
	public int add(int a, int b)
	{
		int sum= a+b;
		return sum;
	}
}
class Add extends Arithmetic
{
	public int getSome(int a, int b)
	{
		return add(a,b);
	}
}

public class Solution2 {

	public static void main(String[] args) {
		Add ans= new Add();
		System.out.println("My superclass is: " + ans.getClass().getSuperclass().getName());
		System.out.print(ans.add(10,32) + " " + ans.add(10,3) + " " + ans.add(10,10) + "\n");
	}

}
