	class Unit {
	    
	}

	class SpiderMan extends Unit {
	    
	}

	class Hulk extends Unit {
	    
	}

	class IronMan extends Unit {
	    
	}
public class aa1 
{		
	    public static void main(String[] args) {
	        Unit unit1 = new Unit();
	        Unit unit2 = new SpiderMan(); // ��ĳ����
	        Unit unit3 = new Hulk(); // ��ĳ����
	        Unit unit4 = new IronMan(); // ��ĳ����

	        if (unit1 instanceof Unit)
	        {
	            System.out.println("unit1�� Unit Ÿ���̴�.");
	        }
	        if (unit1 instanceof SpiderMan) 
	        {
	            System.out.println("unit1�� SpiderMan Ÿ���̴�.");
	        }
	        
	        if (unit2 instanceof SpiderMan) 
	        {
	            System.out.println("unit2�� SpiderMan Ÿ���̴�.");
	        }
	      
	        if (unit2 instanceof IronMan) 
	        { 
	            System.out.println("unit2�� IronMan Ÿ���̴�.");
	        }
	        if (unit3 instanceof Unit) 
	        { 
	            System.out.println("unit3�� Unit Ÿ���̴�.");
	        }
	        if (unit4 instanceof IronMan) 
	        { 
	            System.out.println("unit4�� IronMan Ÿ���̴�");
	        }
	    }
} 

