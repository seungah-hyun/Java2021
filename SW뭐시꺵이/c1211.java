package SW뭐시꺵이;
import java.util.Scanner;
public class c1211 
{
	public static int ladder[][]=new int[100][100];
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		for(int tc=1;tc<=10;tc++)
		{
			int score =sc.nextInt();
			int startX=0;
			int min=12341;
			
			
			for(int y=0;y<100;y++)
				for(int x=0;x<100;x++)
				{
					ladder[y][x]=sc.nextInt();				
				}
				
			int y=0;
			
			while(true)
				{	
					y=0;
					int num=0;
					int x2=0;
					
					for(int x=0;x<100;x++)							
					{	
							
							if(ladder[0][x]==1)
							{
																					
								if(x>0 && x<99)
								{	
									// 왼쪽이동
									if((x-1)>=0&&ladder[y][x-1]==1)
										{
											while((x-1)>=0&&ladder[y][x-1]==1) 
											{x--;num+=1;}
											y++;
											num+=1;
										}							
									//오른쪽이동	
									else if((x+1)>=0&&ladder[y][x+1]==1)
										{
											while((x+1)>=0&&ladder[y][x+1]==1) 
											{x++;num+=1;}
											y++;
											num+=1;
										}
									else								
									y++;
									num+=1;
								}
							
								else if(x==0)
								{	
									//오른쪽이동
									if((x+1)>=0&&ladder[y][x+1]==1)
									{
										while((x+1)>=0&&ladder[y][x+1]==1) 
										{x++;num+=1;}
										y++;
										num+=1;
									}
									else								
									y++;
									num+=1;
									}
							
								else if(x==99)
								{	
									// 왼쪽이동
									if((x-1)>=0&&ladder[y][x-1]==1)
									{
										while((x-1)>=0&&ladder[y][x-1]==1) 
										{x-- ;num+=1;}
										y++;
										num+=1;
									}
								//그냥하강
								else 								
									y++;
									num+=1;									
								}							
								//스탑
								if (y==99)
								{break;}
								}
							}
						if (num<=min)								
						{	startX=x2;
							min=num;
							break;
											
						}
						
						break;
				}
			System.out.printf("#%d %d\n",tc,startX);
			} 			
		}										
	}
