package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class 유근창_백준_9417번_최대GCD {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int caseCnt = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < caseCnt; i++) {
			arr.clear();
			String[] strArr = sc.nextLine().split(" "); //split하여 String 배열에 넣어준다.
			for(int j=0; j<strArr.length; j++) {
				arr.add(Integer.parseInt(strArr[j])); //비교를 위해 int형으로 변환하고 arrayList에 add시켜준다.
			}
			System.out.println(""+getMax(arr));
			
		}

		sc.close();
	}

	public static int getMax(ArrayList<Integer> arr) { //최대값 구하
		int max = 1;
		for (int i = 1; i <= arr.size(); i++) {
			for (int j = i; j < arr.size(); j++) {
				int temp = getGCD(arr.get(i - 1), arr.get(j));
				if (max < temp)
					max = temp;
			}
		}
		return max;
	}

	public static int getGCD(int a, int b) { //두 수의 최대공약수 구하
		int nameogi = 0;
		int small = 1, big = 1;
		if (a > b) { // 두 수중 큰 수 작은 수 판별
			small = b;
			big = a;
		} else if (b > a) {
			small = a;
			big = b;
		}

		while (true) { // 유클리드 호제법
			nameogi = big % small;
			if (nameogi == 0)
				break;
			big = small;
			small = nameogi;
		}
		return small;
	}

}