
public class beepPrint2 {

	public static void main(String[] args) 
	{
		beepThread t=new beepThread();
		t.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("�Ƿη�~");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		

	}

}
