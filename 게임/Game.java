package ∞‘¿”;

public class Game 
{

	
		static final int MAX_Y = 10;
		static  final int MAX_X = 20;
		private char map [][] = new char[MAX_Y][MAX_X];
		
		private GameObject [] who = new GameObject[3];
		
		public Game()
		{
			for(int y = 0 ; y < MAX_Y; y++)
				for(int x = 0; x < MAX_X; x++)
					map[y][x] = '-';
			who[0] = new police(0,0,2);
			who[1] = new thief(5,5,3);
			who[2]= new citizen(7,7,1);
		}
		
		void run()
		{
			System.out.println("***∞Ê¬˚∞˙ µµµœ!***");
			update();
			draw();
			
			while(true)
			{
				clear();
				for(int i = 0; i< who.length; i++)
					who[i].move();
				
				update();
				draw();
				
				if(who[0].collide(who[1]))				
					{
					System.out.println("∞Ê¬˚¿Ã µµµœ¿ª ¿‚æ“¥Ÿ!! \n Ω¬∏Æ");
					break;
					}
					
					
				else if(who[0].collide(who[2]))				
					{
					System.out.println("¿˙¥¬ º±∑Æ«— Ω√πŒ¿Ãø°ø‰ §Ã§Ã \n ∆–πË");
					break;
					}
				
				else if(who[1].collide(who[2]))
					{
					System.out.println("µ∑≥ª≥ˆ!! ≥¢æﬂæ«!! \n ∆–πË");
					break;
					}
				}
					
				
		}
		
		void update()
		{
			for(int i = 0; i < who.length; i++)
				map[who[i].getY()][who[i].getX()] = who[i]. getShape();
		}
		
		void clear()
		{
			for(int i = 0; i < who.length;i++)
				map[who[i].getY()][who[i].getX()] = '-';
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
				else 
					return false;
		}
		
		public static void main(String[] args)
		{
			Game game = new Game();
			game.run();
		
		}
		
		
		
	}
