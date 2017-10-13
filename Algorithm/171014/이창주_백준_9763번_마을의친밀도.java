import java.util.Scanner;
import java.util.Stack;
public class Main {
    static Stack<Integer> st;
    static int[][] map;
    static int min=999999999;
    public static void main(String args[]) throws Exception	{


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        st=new Stack<>();

        map = new int[N][3];

        for(int i=0; i<N; i++) {
            for(int j=0; j<3; j++) {
                map[i][j]=sc.nextInt();
            }
        }
        
        //비트마스킹(이진수 비트를 자료구조로 사용)을 통합 조합 -> 3개 선택 조합
        //i는 부분집합의 총 개수 
        for(int i=0; i<(1<<N); i++){
            int cnt=0;
            int[] index=new int[3];
            
            //비트중에 1인부분 만 체크
            for(int j=0; j<N; j++){
                if((i&(1<<j))!=0){
                    if(cnt<3){
                        index[cnt++]=j;
                    }
                }
            }
            if(cnt==3){
                min=Math.min(min,count(map[index[0]],map[index[1]],map[index[2]]));
            }
        }
        System.out.println(min);
    }

    public static int count(int[] arr1, int[] arr2, int[] arr3) {
        int result=0;
        //친밀도 = d12 + d23 (dij = |xi - xj| + |yi - yj| + |zi - zj|)
        int res1 = Math.abs(arr1[0]-arr2[0])+Math.abs(arr1[1]-arr2[1])+Math.abs(arr1[2]-arr2[2]);
        int res2 = Math.abs(arr2[0]-arr3[0])+Math.abs(arr2[1]-arr3[1])+Math.abs(arr2[2]-arr3[2]);

        result=res1+res2;

        return result;
    }

}
