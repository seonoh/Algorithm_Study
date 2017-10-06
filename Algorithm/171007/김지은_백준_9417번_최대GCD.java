// 171007 스터디 9417번 문제 ( 최대 GCD ) 
// 정수 M개가 주어졌을 때, 모든 두 수의 쌍 중에서 가장 큰 최대공약수 찾는 프로그램을 작성하시오.
// 첫째 줄에 테스트 케이스의 개수 N이 주어진다. 각 테스트 케이스는 한줄로 이루어져 있으며, 양의 정수 M개가
// 주어진다. 모든 숫자는 int 범위이다.
// 각 테스트 케이스 마다, 입력으로 주어진 수의 모든 두 수의 쌍의 최대공약수 중 가장 큰 값을 출력한다.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int num = Integer.parseInt(sc.nextLine());	// 테스트 케이스 개수 N 입력 및 저장
	      int result = 0;
	      
	      // N개의 테스트 케이스 입력 받기
	      for(int i = 0; i < num; i++){
	         String str = sc.nextLine();
	         String [] temp = str.split(" ");
	         int [] words = new int[temp.length];
	         // String 배열을 int 배열로 변환
	         for(int j = 0 ; j < temp.length; j++){
	            words[j] = Integer.parseInt(temp[j]);
	         }        
         
	         int val1, val2;
	         for(int m = 0; m < words.length-1; m++){
	            for(int n = m+1; n < words.length; n++){
	            	// 큰 수 : val1, 작은 수 : val2
	            	if(words[m] > words[n]){
	             	   val1 = words[m];
	                    val2 = words[n];
	                }else{
	             	   val1 = words[n];
	                    val2 = words[m];
	                }
	            	// 최대 공약수 구하기
	                int r = 1;
	                while(r > 0){
	                   r = val1 % val2;
	                   val1 = val2;
	                   val2 = r;
	                }
	                // 가장 큰 결과만 저장
	                if(result < val1){
	                   result = val1;
	                }
	             }
	          }
	          // 결과 출력
	          System.out.println(""+ result);
	          result = 0;
	      }
	   }
	}
