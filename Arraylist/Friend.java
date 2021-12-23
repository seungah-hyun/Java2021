package Arraylist;

public class Friend 
{
	private String name;
	private String major;
	private int age;
	private double height;
	
	public Friend(String name,String major,int age,double height)
	{
		this.age=age;
		this.height=height;
		this.major=major;
		this.name=name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setMajor(String major)
	{
		this.major=major;
	}
	public String getMajor()
	{
		return major;
	}

	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public double getHeight()
	{
		return height;
	}
	
}
