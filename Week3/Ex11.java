package Week3;

public class Ex11 {

	public static void main(String[] args) {
		int cost = 2000;
		System.out.printf("��ǰ�ǰ��� : %d\n",cost);
		
		System.out.printf("��ǰ�ǰ��� : %-6d\n",cost);
		System.out.printf("��ǰ�ǰ��� : %6d\n",cost);
		System.out.printf("��ǰ�ǰ��� : %06d\n",cost);
	
		
		int r = 10;
	    double area = 3.14*r*r;
	    System.out.printf("�������� %d ���� ���� : %f\n", r,area);
	    System.out.printf("�������� %d ���� ���� : %10.2f\n", r,area);

	    String name = "������";
	    String job = "����";
	    System.out.printf("%-10s %10s", name, job);
	    
	    
	}

}
