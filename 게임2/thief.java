package 게임2;

import 게임2.game;

public class thief implements InterFace{

	int x,y,distance;
	
	public thief(int x, int y, int distance) {
		this.x=x;
		this.y=y;
		this.distance=distance;
	}

	@Override
	public void move() {
		int n = (int)(Math.random()*5); // 0,1,2,3,4 중에서 0인 경우 + 방향, 1인 경우 - 방향, 나머지 정지
		if(n==0) x += distance;
		else if(n==1) x -= distance;

		if(x < 0) x=0;
		if(x >= game.MAX_X) x = game.MAX_X - 1;
		 
		n = (int)(Math.random()*5);
		if(n==0) y += distance;
		else if(n==1) y -= distance;

		if(y < 0) y=0;
		if(y >= game.MAX_Y) y= game.MAX_Y - 1;
		
	}

	@Override
	public char getShape() {
		
		return 'T';
	}

	@Override
	public boolean collide(InterFace i) 
	{
		if(this.x == i.getX() && this.y == i.getY())
		return true;
	else 
		return false;
	}

	@Override
	public int getY() {
		
		return y;
	}

	@Override
	public int getX() {
		
		return x;
	}

}
