package Multy;

import java.awt.Toolkit;

public class mul implements Runnable
{
	@Override
	public void run() {
		int mul=1;
		for(int i=1;i<=10;i++)
		{
			mul*=i;
			System.out.println(mul);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
