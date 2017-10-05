package algorithm.Progremers;

/*
 * 피보나치 수는 F(0) = 0, F(1) = 1일 때, 2 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는
 * 점화식입니다. 2 이상의 n이 입력되었을 때, fibonacci 함수를 제작하여 n번째 피보나치 수를 반환해 주세요. 예를 들어 n =
 * 3이라면 2를 반환해주면 됩니다.
 */
public class Progremers_Lv1_Fibonacci {

    /*
     * index 0 1 2 3 4 5 6 7
     * value 0 1 , 1 2 3 5 8 13
     * My Answer Success
     *
     * num 만큼 배열로 피보나치 값을 만들고 -1, -2 인덱스의 값을 더하는 식
     */
    public long fibonacci(int num) {
        long[] arr = new long[num];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            // System.out.println(String.format("%d, %d", i, arr[i]));
        }
        return arr[num - 1] + arr[num - 2];
    }

    /*
     * Recursive
     */
    public long fibonacci2(int num) {
        long answer = 0;
        if (num < 2) {
            answer = num;
        } else {
            answer = fibonacci2(num - 1) + fibonacci2(num - 2);
        }
        return answer;
    }

    public long fibonacci3(int num) {
        long a=0, b=1, temp;
        for (int i = 0; i < num; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Progremers_Lv1_Fibonacci c = new Progremers_Lv1_Fibonacci();
        int testCase = 500;
        System.out.println(c.fibonacci(testCase));
    }
}
