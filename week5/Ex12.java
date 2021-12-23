package week5;

public class Ex12 {

	public static void main(String[] args) {
		String position = "과장";
		switch(position)
		{
		case "부장":
			System.out.println("월급 2억");
			break;
		case "과장":
			System.out.println("월급 1억");
			break;
		case "실장":
			System.out.println("월급 0.5억");
			break;
		case "대리":
			System.out.println("월급 0.3억");
			break;
		default:
			System.out.println("월급 0.01억");
		
		}

	}

}
