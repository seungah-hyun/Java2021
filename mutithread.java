import java.awt.Toolkit;

public class mutithread {
	public static void main(String[] args)
	{
		Toolkit toolkit =Toolkit.getDefaultToolkit();
		
		for(int i=0;i<5;i++)
		{
			toolkit.beep();			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
	}

}
