package SWππΩ√É€¿Ã;
import java.util.Scanner;
public class e1211 
{
   public static void main(String[] args) 
   {
      Scanner sc= new Scanner(System.in);

      for(int tc=1; tc<=10+1; tc++){
         int ladder[][]=new int[102][102];  
         int score =sc.nextInt();
         int min=100000;
         
         for(int i = 1; i <= 100; i++) { 
            for(int j = 1; j <= 100; j++) { 
               ladder[i][j] = sc.nextInt();
            }
         }
         int x, y; 
         int startX = 0; 
           for (int j = 1; j <= 100; j++) { 
               if (ladder[1][j] == 1) {   
                   y = j;               
                   int num = 0;         
                   for (int i = 1; i <= 100; i++) {   
                       num++;                     
                       if (ladder[i][y + 1] == 1) {   
                           while (true) {            
                               y++;               
                               num++;               
                               if (ladder[i][y + 1] != 1) {   
                                   break;
                               }
                           }
                       }
                       else if (ladder[i][y - 1] == 1) {  
                           while (true) {
                               y--;
                               num++;
                               if (ladder[i][y - 1] != 1) {
                                   break;
                               }
                           }
                       }
                       
                   }
                   if (num <= min) {
                	   
                       startX = j - 1;   
                       min = num;
                   }
               }
           }
           System.out.println("#"+tc+" "+startX);   

      }
      
      sc.close();      

   }

}