package algorithm.Backjoon;

/*
 * @url : https://www.acmicpc.net/problem/8320
 *
 * 8320번: 직사각형을 만드는 방법
 *
 * 상근이는 변의 길이가 1인 정사각형 n개를 가지고 있다.
 * 이 정사각형을 이용해서 만들 수 있는 직사각형의 개수는 총 몇 개일까? 두 직사각형 A와 B가 있을 때,
 * A를 이동, 회전시켜서 B를 만들 수 없으면, 두 직사각형은 다르다고 한다.
 * 직사각형을 만들 때, 정사각형을 변형시키거나, 한 정사각형 위에 다른 정사각형을 놓을 수 없다.
 * 또, 직사각형은 정사각형으로 꽉 차있어야 한다. 입력 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * 출력 만들 수 있는 직사각형의 개수를 출력한다.
 * 예제 입력  6
 * 예제 출력  8
 *
 */

import java.util.Scanner;

public class Backjoon_8320 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(), count = 0;
        for (int i = 1; i <= c / 2; i++) {  // 사각형 갯수의 절반 보다 같거나 작을 때까지 반복하는 이유는 그 이후로 반복하는 것은 중복되기 때문입니다
            for (int j = i; i * j <= c; j++)  // 3개 5개 같은 갯수로 직사각형을 만들수 없으므로 j = i, 를 설정하였고, i 와 곱하여 c 보다 작을 때 까지 반복하면 열의 갯수 만큼 만들어지는 직사각형 갯수를 구할 수 있습니다 (1,2,3,.... 4,6,8,..)
                count++;
        }
        System.out.print(count == 0 ? 1 : count);
    }
}