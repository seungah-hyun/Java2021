
public class BeepPrint {

	public static void main(String[] arg)
	{
		Runnable beeptask =new beepTask();
		Thread t= new Thread(beeptask);
		
		t.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("µå¸£¸ª~");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
	}
}
