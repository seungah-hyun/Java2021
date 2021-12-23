package 버퍼;
import java.util.*;
import java.io.*;

public class Swea2005 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new inputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());//테스트케이스
		int[][]arr;
		int N=Integer.parseInt(br.readLine());//길이
		arr =new int [N][N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		for(int i=0;i<st.hasMoreTokens();i++) {
			arr[i][i]=1;
			arr[i][0]=1;
		}
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(arr[i][j]!=0)
				{
					arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
				}
					
			}
		}
		
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
