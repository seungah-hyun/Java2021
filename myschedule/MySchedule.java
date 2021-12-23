package myschedule;
import java.util.Scanner;
import java.util.Calendar;

public class MySchedule 
{
	Scanner sc=new Scanner(System.in);
	
	private int month;
	private int date;
	private String todo;
	private int lastday;
	
	public MySchedule() {
		this.month=1;
		this.date=1;
		this.todo=null;
		
	}
	Calendar cal= Calendar.getInstance();
	private String[][] whatTodo=new String[13][32];
	
	public void setTodo()
	{
		System.out.println("����� �Է� : ");
		String what=sc.nextLine();
		this.todo=what;
	}
	public String getTodo()
	{
		return todo;
	}
	
	public void setMonth()
	{
		int month;
		System.out.println("1������ 12������ �Է�");
		month=sc.nextInt();
		this.month=month;
		cal.set(Calendar.MONTH, month-1);
		lastday=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setDate()
	{
		int date;
		System.out.println("1�� ����"+lastday);
		date=sc.nextInt();
		this.date=date;
	}
	public int getDate()
	{
		return date;
	}
	
	public void setWhattodo()
	{
		int m=getMonth();
		int d=getDate();
		System.out.print("� ����� : ");
		this.todo=sc.next();
		whatTodo[m][d]=todo;
	}
	
	public String getWhattodo()
	{
		return (whatTodo[getMonth()][getDate()]);
	}
	
	public void showWhattodo()
	{
		System.out.println(getWhattodo());
	}

}
