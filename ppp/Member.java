package ppp;

public class Member 
{
	public String id;
	public Member(String id)
	{
		this.id=id;
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Member)
		{
			Member m=(Member)obj;
			if(id.equals(m.id))
				return true;
				
		}
		return false;
	}

}
