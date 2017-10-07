package test;

import java.util.*;

public class 유근창_백준_8320번_직사각형 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, r = 0;
		n = sc.nextInt();
		for (int i = 1; i <= Math.sqrt(n); i++) //index는 n의 루트만큼까지만 가면 중복되는 경우는 빠
			r += n / i - i + 1; //중복되는 만큼 i를 빼주고 +1은 자기 자
		System.out.println(r);
	}
}
