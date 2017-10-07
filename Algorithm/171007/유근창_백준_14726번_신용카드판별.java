package test;

import java.util.Scanner;

public class 유근창_백준_14726번_신용카드판별 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < cnt; i++) {
			int sum = 0;
			String str = sc.nextLine();
			for (int j = 0; j < str.length(); j++) { 
				if (j % 2 == 0) { //짝수 인덱스만 2배시킨다.
					int a = (str.charAt(j) - '0') * 2;
					if (a >= 10)
						sum += a / 10 + a % 10; //10 이상되면 각 자리를 더한다.
					else
						sum += a;
				} else {
					sum += str.charAt(j) - '0';
				}
			}
			if(sum % 10 == 0) System.out.println("T");
			else System.out.println("F");
		}

		sc.close();

	}
}
