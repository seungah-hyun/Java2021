package 게임2;
import java.util.Scanner;

import 게임2.game;

public class police implements InterFace{

	Scanner sc= new Scanner(System.in);
	int x,y,distance;
	
	
	public police(int x, int y, int distance) {
		
		this.x=x;
		this.y=y;
		this.distance=distance;
	}

	@Override
	public void move() {
		System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(d) >> ");
		char c;
		c = sc.next().charAt(0);
		switch(c) {
			case 'a' : // left
				x--; 
				if(x < 0) x = 0;
				break;
			case 'd' : // right
				x++; 
				if(x >= game.MAX_X) x = game.MAX_X - 1;
				break;
			case 'w' : // up
				y--; 
				if(y < 0) y = 0;
				break;
			case 's' : // down
				y++; 
				if(y >= game.MAX_Y) y = game.MAX_Y - 1;
				break;
		}		
	}
		
	

	@Override
	public char getShape() {
		// TODO Auto-generated method stub
		return 'P';
	}

	@Override
	public boolean collide(InterFace i) {
		if(this.x == i.getX() && this.y == i.getY())
			return true;
		else 
			return false;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

}
