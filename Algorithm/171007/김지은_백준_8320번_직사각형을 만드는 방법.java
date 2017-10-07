// 171007 스터디 8320번 문제 (직사각형을 만드는 방법) 

/* 상근이는 변의 길이가 1인 정사각형 n개를 가지고 있다. 
 * 이 정사각형을 이용해서 만들 수 있는 직사각형의 개수는 총 몇 개일까?

두 직사각형 A와 B가 있을 때, A를 이동, 회전시켜서 B를 만들 수 없으면, 
두 직사각형은 다르다고 한다. 직사각형을 만들 때, 정사각형을 변형시키거나, 
한 정사각형 위에 다른 정사각형을 놓을 수 없다. 
또, 직사각형은 정사각형으로 꽉 차있어야 한다.

입력
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

출력
만들 수 있는 직사각형의 개수를 출력한다.
*/
import java.util.Scanner;
public class exam_8320 {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int num = Integer.parseInt(sc.nextLine());	// 테스트 케이스 개수 n 입력 및 저장
	      int result = num;	// 무조건 한줄 짜리는 n개 만큼 있음
	      // 2줄 부터 (n/2) 줄 까지 계산
	      for(int i = 2; i <= num/2; i++)
	      {	    	 
	    	  if(i*i <= num)
	    		  result += (num/i)-(i-1);
	    	  else
	    		  break;
	      }
	      // 출력
	      System.out.println(result);
	}
}
