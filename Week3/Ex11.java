package Week3;

public class Ex11 {

	public static void main(String[] args) {
		int cost = 2000;
		System.out.printf("상품의가격 : %d\n",cost);
		
		System.out.printf("상품의가격 : %-6d\n",cost);
		System.out.printf("상품의가격 : %6d\n",cost);
		System.out.printf("상품의가격 : %06d\n",cost);
	
		
		int r = 10;
	    double area = 3.14*r*r;
	    System.out.printf("반지름이 %d 원의 넓이 : %f\n", r,area);
	    System.out.printf("반지름이 %d 원의 넓이 : %10.2f\n", r,area);

	    String name = "샬랄라";
	    String job = "도둑";
	    System.out.printf("%-10s %10s", name, job);
	    
	    
	}

}
