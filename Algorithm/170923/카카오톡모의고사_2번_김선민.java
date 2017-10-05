class Solution {
    int solution(int[][] land) {
        int var = 0;
        int answer = 0;

        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                int max = 0;
                for (int k = 0; k < land[i].length; k++) {
                    if (j != k) {
                        var = land[i][j] + land[i - 1][k];
                        max = (max > var) ? max : var;
                    }
                }
                land[i][j] = max;
                answer = (answer > max) ? answer : max;
            }
        }
        return answer;
    }
}
