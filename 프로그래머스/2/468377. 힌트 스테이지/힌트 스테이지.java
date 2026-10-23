class Solution {
    public int solution(int[][] cost, int[][] hint) {
        int n = cost.length;
        int answer = Integer.MAX_VALUE;

        // 구매 가능한 모든 번들의 구매 여부를 탐색
        int totalCases = 1 << (n - 1);

        for (int mask = 0; mask < totalCases; mask++) {
            int[] hintCount = new int[n];
            int total = 0;

            // 1. 현재 조합에서 구매할 번들을 선택
            for (int i = 0; i < n - 1; i++) {
                if ((mask & (1 << i)) != 0) {
                    // 번들 구매 비용
                    total += hint[i][0];

                    // 번들에 포함된 힌트권 추가
                    for (int j = 1; j < hint[i].length; j++) {
                        int target = hint[i][j] - 1;
                        hintCount[target]++;
                    }
                }
            }

            // 2. 각 스테이지 해결 비용 계산
            for (int i = 0; i < n; i++) {
                int useCount = Math.min(
                    hintCount[i],
                    cost[i].length - 1
                );

                total += cost[i][useCount];
            }

            // 3. 최소 비용 갱신
            answer = Math.min(answer, total);
        }

        return answer;
    }
}