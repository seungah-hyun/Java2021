package ���ο�;
import java.util.Scanner;
public class �Լ�1�ڰ�����5 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=power(a,b);//a^b�� ���ϴ��Լ�power �ۼ��ҿ���
		
		System.out.println(ans);
		

	}
	public static int power(int a,int b)
	{
	int val=1;
	for (int now =0;now<b;now++)
		val*=a;
	return val;
	}
	
}
