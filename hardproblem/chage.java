package hardproblem;

public class chage {

	
	public static void main(String[] args) {
		

		char c[]= {'추','석','이',' ','끝','났','다'};
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
	addone(c);
	for(int i=0;i<c.length;i++)
	{
		System.out.print(c[i]+" ");
	}

}
	static void addone(char[]b)
	{
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==' ')
			{
				b[i]='*';
			}
		}
	}
}