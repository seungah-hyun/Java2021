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
	        Unit unit2 = new SpiderMan(); // 업캐스팅
	        Unit unit3 = new Hulk(); // 업캐스팅
	        Unit unit4 = new IronMan(); // 업캐스팅

	        if (unit1 instanceof Unit)
	        {
	            System.out.println("unit1은 Unit 타입이다.");
	        }
	        if (unit1 instanceof SpiderMan) 
	        {
	            System.out.println("unit1은 SpiderMan 타입이다.");
	        }
	        
	        if (unit2 instanceof SpiderMan) 
	        {
	            System.out.println("unit2는 SpiderMan 타입이다.");
	        }
	      
	        if (unit2 instanceof IronMan) 
	        { 
	            System.out.println("unit2는 IronMan 타입이다.");
	        }
	        if (unit3 instanceof Unit) 
	        { 
	            System.out.println("unit3은 Unit 타입이다.");
	        }
	        if (unit4 instanceof IronMan) 
	        { 
	            System.out.println("unit4는 IronMan 타입이다");
	        }
	    }
} 

