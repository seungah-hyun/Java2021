package fishing;

public class Game 
{

	private static final int MAX_Y=10;
	private static final int MAX_X=20;
	private char map[][]=new char[MAX_Y][MAX_X];
	
	private GameObject[]who=new GameObject[2];
	public Game()
	{
		for(int y=0;y<MAX_Y;y++)
		{
			for(int x=0;x<MAX_X;x++)
			{
				map[y][x]='-';
			}
		}
		who[0]=new Bear(0,0,1);
		who[1]=new Fish(5,5,2);
	}
	void run()
	{
		System.out.println("***곰의 물고기 잡기***");
		
		update();
		draw();
		clear();
		for(int i=0;i<who.length;i++)
			who[i].move();
		
		update();
		draw();
	}
	void update()
	{
		for(int i=0;i<who.length;i++)
			map[who[i].getY()][who[i].getX()]=who[i].getShape();
	}
	void draw()
	{
		System.out.println();
		for(int y=0;y<MAX_Y;y++)
			{
			for(int x=0;x<MAX_X;x++)				
				{
				System.out.print(map[y][x]);				
				}
			
			System.out.println();
			}
	}
	
		
	}
	




