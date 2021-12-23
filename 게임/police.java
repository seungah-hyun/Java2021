package 게임;

import java.util.Scanner;

import 게임.Game;

public class police extends GameObject {
	private Scanner scanner= new Scanner(System.in);
	public police(int x, int y, int distance) {
		super(x, y, distance);
	//	scanner = new Scanner(System.in);
	}
	
	@Override
	public void move() {
		System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(d) >> ");
		char c;
		c = scanner.next().charAt(0);
		switch(c) {
			case 'a' : // left
				x--; 
				if(x < 0) x = 0;
				break;
			case 'd' : // right
				x++; 
				if(x >= Game.MAX_X) x = Game.MAX_X - 1;
				break;
			case 'w' : // up
				y--; 
				if(y < 0) y = 0;
				break;
			case 's' : // down
				y++; 
				if(y >= Game.MAX_Y) y = Game.MAX_Y - 1;
				break;
		}		
	}
	
	@Override
	public char getShape() { // Bear의 모양 리턴
		return 'P';
	}
}