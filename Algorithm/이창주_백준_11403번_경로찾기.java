import java.util.Scanner;

public class Main {

public static void main(String args[]) throws Exception	{
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		int[][] map = new int[N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j]=sc.nextInt();
			}	
		}
		
		//k점을 경유해서 i에서 j로 가는 경로가 존재하면 1.
		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(map[i][k]==1 && map[k][j]==1) {
						map[i][j]=1;
					}
				}	
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
