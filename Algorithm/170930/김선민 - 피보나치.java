package algorithm;

import java.util.Scanner;

public class Kakao_0930_001 {
	public long fibonacci(int num) {
		long answer = 0;
		long[] x = new long[num+1];
		x[0] = 0;
		x[1] = 1;
			
		for(int i=2; i < x.length; i++){
			
			x[i] = x[i-1] + x[i-2];

		}		
		answer = x[num];
		return answer;
	}
	public static void main(String[] args) {
		Kakao_0930_001 c = new Kakao_0930_001();
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 넣으시오.");
		int testCase = sc.nextInt();
		System.out.println(c.fibonacci(testCase));
		
	}
}
