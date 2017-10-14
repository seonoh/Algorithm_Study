import java.util.Scanner;

public class Backjoon_14726 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < c; i++) {
            int sum = 0;
            char[] cs = sc.nextLine().toCharArray();    // 16개의 숫자를 char 배열로 변환 합니다
            for (int j = cs.length-1; j > 0; j -= 2) {  // 우측 부터 계산 하므로 cs.length 로 시작해서 0 보다 작을 때까지 감소 시키면서 계쏙 반복합니다
                int tmp = Integer.parseInt(cs[j - 1] + "") * 2; // 짝수 번째 숫자에 * 2 를 합니다
                sum += Integer.parseInt(cs[j] + "") + tmp / 10 + tmp % 10;  // sum 에 홀수 번째 수와 짝수 번째 10의자리, 1의 자리를 더합니다 (10의 자리가 있거나 없어도 됩니다)
            }
            System.out.println(sum % 10 == 0 ? "T" : "F");  // sum 이 10으로 나뉘어지면 T, 아니면 F 를 출력합니다
        }
    }
}