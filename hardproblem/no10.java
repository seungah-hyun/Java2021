package hardproblem;

public class no10{
	
	
   private int num;
   no10() 
   {
	   num =100;
   }
   no10(int num) 
   {
      this();   //�⺻�����ڸ� ȣ��
      this.num = num+ this.num;
   }
   
   public int getRollNum() 
   {
	  return num;
   }
  
   public static void main(String args[])
   {
	   no10 obj = new no10(55);
	   
       System.out.println(obj.getRollNum());
    }
}


