	class 순대
	{
		public void with() {
			
		}
	}
	class 경상도순대 extends 순대
	{
		@Override
		public void with()
		{
			
		}
	}
	class 강원도순대 extends 순대
	{
		@Override
		public void with()
		{
			
		}
	}
	class 손님
	{
		public void 순대먹기(순대 어디지역순대)
		{
			어디지역순대.with();
		}
	}
public class a2 {

	
	public static void main(String[] args) 
	{
		손님 손님1=new 손님();
		순대 순대주문 = new 강원도순대();
		손님1.순대먹기(순대주문);

	}

}
