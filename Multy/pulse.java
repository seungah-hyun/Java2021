package Multy;

public class pulse {

	public static void main(String[] args) {

		Runnable multy =new mul();
		Thread m= new Thread(multy);
		m.start();
		
			int pluse=0;
			for(int i=0;i<=10;i++)
			{
				pluse+=i;
				System.out.println(pluse);		
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		

	}

}
