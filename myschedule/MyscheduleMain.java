package myschedule;
import java.util.*;
public class MyscheduleMain extends MySchedule
{

	public static void main(String[] args) 
	{
		MySchedule ms=new MySchedule();
		Scanner sc=new Scanner(System.in);
		
		int what=0;
		while(true)
		{
			System.out.println("스케줄 입력 1,확인 2, 종료 3");
			
			what=sc.nextInt();
			switch(what)
			{
			case 1:
				ms.setMonth();
				ms.setDate();
				ms.setWhattodo();
				
				break;
			case 2:
				ms.setMonth();
				ms.setDate();
				ms.showWhattodo();
				break;
				
				
			case 3:
				System.exit(0);
			
			}
			
		}
		

	}

}
