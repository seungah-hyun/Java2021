package ����;

import java.util.Scanner;

import ����.Game;

public class police extends GameObject {
	private Scanner scanner= new Scanner(System.in);
	public police(int x, int y, int distance) {
		super(x, y, distance);
	//	scanner = new Scanner(System.in);
	}
	
	@Override
	public void move() {
		System.out.print("����(a), �Ʒ�(s), ��(w), ������(d) >> ");
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
	public char getShape() { // Bear�� ��� ����
		return 'P';
	}
}