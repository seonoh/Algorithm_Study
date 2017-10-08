package algorithm.Backjoon;


/*
 *
 * @url : https://www.acmicpc.net/problem/9417
 *
 * 최대 GCD
 *
 * 정수 M개가 주어졌을 때, 모든 두 수의 쌍 중에서 가장 큰 최대공약수 찾는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 N (1 < N < 100)이 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 양의 정수 M (1 < M < 100)개가 주어진다. 모든 숫자는 int 범위이다.
 *
 * 출력
 * 각 테스트 케이스 마다, 입력으로 주어진 수의 모든 두 수의 쌍의 최대공약수 중 가장 큰 값을 출력한다.
 *
 * 예제 입력
 * 3
 * 10 20 30 40
 * 7 5 12
 * 125 15 25
 *
 * 예제 출력
 * 20
 * 1
 * 25
 *
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Backjoon_9417 {

            3
            10 20 30 40
            7 5 12
            125 15 25

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine()); // 열의 갯수
        for (int i = 0; i < count; i++) {
            String[] arr = sc.nextLine().split(" "); // 하나의 line 을 String[] 로 변환 합니다
            int max = 0, size = arr.length; // 최대 공약수, 숫자의 갯수
            for (int j = 0; j + 1 < size; j++) {    // 기준이 되는 숫자 (10 20 30 40 일 경우 40을 제외한 숫자들이 기준이 되는 숫자입니다)
                int i1 = Integer.parseInt(arr[j]);
                for (int k = j + 1; k < size; k++) {    // 비교할 숫자 (10이 기준이 되는 숫자일 경우 10을 제외한 모든 숫자가 비교할 숫자입니다)
                    int i2 = Integer.parseInt(arr[k]);
                    for (int m = Math.min(i1, i2); m > 0; m--) {    // 최대 공약수를 구하기 위해서 두 숫자 중 작은것을 max 로 설정하고 하나씩 감소시켜서 공약수인지 판별합니다
                        if (i1 % m == 0 && i2 % m == 0) {   // 공약수 일 경우 max 설정
                            max = Math.max(max, m);
                            break;
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }
}