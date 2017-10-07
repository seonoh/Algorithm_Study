// 171007 스터디 14726번 문제 ( 신용카드 판별 ) 

/* 신용카드는 총 16자리의 숫자로 구성되어 있다. 
 * 언뜻 보기에는 무작위로 된 숫자로 구성되어 있는 것 같이 보이지만 그 속에는 하나의 수학적 비밀이 숨겨져 있다. 
 * 그중 하나가 카드 번호가 유효 한지 유효하지 않은 지 검사하는 Luhn 공식이다. 그 공식은 다음과 같다.
 * 신용카드의 16자리 숫자에서 맨 우측 수부터 세어 홀수 번째 수는 그대로 두고, 짝수 번째 수를 2배로 만든다.
 * 2배로 만든 짝수 번째 수가 10 이상인 경우, 각 자리의 숫자를 더하고 그 수로 대체한다.
 * 이와 같이 얻은 모든 자리의 수를 더한다.
 * 그 합이 10으로 나뉘면 “정당한 번호”(유효)이고 그렇지 않으면 “부당한 번호”(유효하지 않음)로 판정된다.
 * 다음 공식을 이용해 주어진 신용카드의 번호가 유효한지, 유효하지 않은 지 판단해라.

입력
첫째 줄에 테스트 케이스의 수 T(1 ≤ T ≤ 1000)이 주어진다.

그 다음 줄부터 테스트 케이스에 해당하는 신용카드 번호가 주어진다.

출력
신용카드의 번호가 유효하면 “T”, 유효하지 않으면 “F”를 한 줄 씩 출력한다.
*/import java.util.Scanner;
public class exam_14726 {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int num = Integer.parseInt(sc.nextLine());	// 테스트 케이스 개수 T 입력 및 저장

	      // N개의 테스트 케이스 입력 받기
	      for(int i = 0; i < num; i++){
	         String str = sc.nextLine();
	         int [] target = new int[16];
	         for(int m=0; m<str.length(); m++)
	         {
	        	 // int 형 배열에 16자리 번호 담기
	       		 target[m] = Integer.parseInt(str.substring(m, m+1)); 
	         }
	         
	         int temp = 0;
	         // 신용카드의 짝수번째 수 2배로 만드는 과정
	         for(int m=target.length-1; m>=0; m--)
	         {        	 
	        	 if((m % 2) == 0)
	        	 {
	        		 // 짝수만 작업
	        		 target[m]=(target[m]*2) < 10 ? target[m]*2 : ((target[m]*2)/10) + ((target[m]*2)%10);
	        	 }        	 
	        	 // 모든 수 더하기
	        	 temp += target[m];
	         }
	         // 출력
	         System.out.println((temp%10) == 0 ? "T" : "F");
	      }
	   }
	}
