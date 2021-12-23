package 시험;
import java.util.Scanner;
public class 연습용 {

	
		public static int Data[][] = new int [5][5]; // 전역변수
        
        public static boolean IsSafe(int y , int x) { 
           
           if (x>=0 && x<5 && y>=0 && y<5) 
              return true;
           else 
              return false ;
        }
        
        public static int MyAbs(int a , int b) {
          
           if (a>b) return a-b;
              
           else return b-a;
                       
        }
        
        
        public static void main(String[] args) 
        {
           Scanner sc = new Scanner(System.in);
           for (int y = 0 ; y <5 ; y++) 
              for(int x = 0 ; x<5 ; x++)
                 Data[y][x] = sc.nextInt();
             
           int [] dy = {-1 ,1 ,0 ,0};
           int [] dx = {0 ,0 ,-1 ,1};
             // 차례대로 => 상 하 좌 우 
        
           int sum = 0 ;
           for (int y = 0 ; y <5 ; y++) 
           {
              for(int x = 0 ; x<5 ; x++)
              {
                 for (int dir = 0 ; dir < 4 ; dir++) 
                 {
                    int newY= y+dy[dir];
                    int newX= x+dx[dir];
                    if (IsSafe(newY,newX)) // 안전한지 불안전한지 만드는 함수를 만들자.
                       sum+=MyAbs(Data[y][x], Data[newY][newX]);
                 }
              }
              
           }
           System.out.println(sum);
           
        }      
  }
