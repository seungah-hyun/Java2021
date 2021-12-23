package ∞‘¿”2;


public class game {
	
	public static final int MAX_Y = 10;
	public static final int MAX_X = 20;	
	char map [][] = new char[MAX_Y][MAX_X];

	InterFace [] who = new InterFace[3];
	
	public game()
	{
		for(int y = 0 ; y < MAX_Y; y++)
			for(int x = 0; x < MAX_X; x++)
				map[y][x] = '-';
		
		int Px = 0;
		int Py = 0;
		int Tx = 0;
		int Ty = 0;
		int Cx = 0;
		int Cy = 0;
		
		while(Px==Tx||Tx==Cx||Tx==Px)
		{
			Px = (int)(Math.random()*20);
			Py = (int)(Math.random()*10);
			Tx = (int)(Math.random()*20);
			Ty = (int)(Math.random()*10);
			Cx = (int)(Math.random()*20);
			Cy = (int)(Math.random()*10);
		
		}
		who[2] = new police(Px,Py,1);
		who[1] = new thief(Tx,Ty,1);
		who[0]= new citizen(Cx,Cy,1);
		
	}
	public void run()
	{
		System.out.println("***∞Ê¬˚∞˙ µµµœ!***");
		update();
		draw();
		
		while(!isCatching())
		{
			clear();
			for(int i = 0; i< who.length; i++)
				who[i].move();
			
			update();
			draw();
		 
		if(who[2].collide(who[0]))				
			{
			System.out.println("∞Ê¬˚: ≤ƒ¬¶∏∂! ≥ ¥¬ π¨∫Ò±«¿ª...ø®?\nΩ√πŒ: ¿˙¥¬ º±∑Æ«— Ω√πŒ¿Ãø°ø‰ §Ã§Ã \n          ∆–πË");
			break;
			}		
		else if(who[1].collide(who[0]))
			{
			System.out.println("µµµœ :µ∑≥ª≥ˆ!!\nΩ√πŒ: ≥¢æﬂæ«!! \n    ∆–πË");
			break;
			}
		else if(who[2].collide(who[1]))
			{
			System.out.println("∞Ê¬˚:¿‚æ“¥Ÿ ø‰≥!! \nµµµœ:¥ŸΩ≈ æ»±◊∑Ø∞⁄Ω¿¥œ¥Ÿ §–§–. \n        Ω¬∏Æ");
			break;
			}		
		}		
	}
	public void update()
	{
		for(int i = 0; i < who.length; i++)
		{			
			map[who[i].getY()][who[i].getX()] = who[i]. getShape();				
		}
	}
	void draw()
	{
		System.out.println();
		for(int y = 0 ;y < MAX_Y; y++)
		{
			for(int x = 0; x < MAX_X; x++)
				System.out.print(map[y][x]);
			System.out.println();
		}
	}
	boolean isCatching()
	{
			if(who[0].collide(who[1]))
				return true;
			else if(who[1].collide(who[2]))
				return true;
			else if(who[0].collide(who[2]))
				return true;
			else 
				return false;			
	}
	public void clear()
	{
		for(int i = 0; i < who.length;i++)
			map[who[i].getY()][who[i].getX()] = '-';
	}
	public static void main(String[] args)
	{
		game g =new game();
		g.run();
	}
}
