public class Test_5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] i = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        System.out.println(solution(i));
    }

    static int solution(int[][] land) {
        int answer = 0;
        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < 4; j++) {
                // 열 값을 하나씩 선택
                int max = 0;
                for (int k = 0; k < 4; k++)
                    // j 가 0일 경우 같은 열을 선택하였는지 확인
                    if (j != k)
                        max = Math.max(max, land[i - 1][k]);
                land[i][j] += max;
            }
        }
        for (int i : land[land.length - 1])
            answer = Math.max(answer, i);

        return answer;
    }
}
