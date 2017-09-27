package algorism;

import java.util.Scanner;

public class kakao_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		int n = sc.nextInt();
		solution(n);
	}
	public static int solution(int n) {
        
        int answer = 0;
        int x = 0;
        while(n>0){
        	x = n%10;
        	n = n/10;
        	System.out.println(x);
        	answer = answer + x;
        }
        
        System.out.println(answer);
		return answer;
	}
}
