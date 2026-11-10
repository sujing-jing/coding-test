
class Solution {

    static int answer = 0;

    static void dfs(int k, int count, boolean[] visited, int[][] dungeons) {

        // 현재까지 탐험한 던전 수 갱신
        answer = Math.max(answer, count);

        for(int i = 0; i < dungeons.length; i++) {

            // 이미 탐험한 던전이면 건너뛰기
            if(visited[i]) {
                continue;
            }

            // 현재 피로도가 최소 필요 피로도 이상인 경우
            if(k >= dungeons[i][0]) {

                visited[i] = true;

                // 던전 탐험 후 소모 피로도 차감
                dfs(k - dungeons[i][1], count + 1, visited, dungeons);

                // 백트래킹: 방문 상태 복구
                visited[i] = false;
            }
        }
    }

    public int solution(int k, int[][] dungeons) {
        answer = 0;

        boolean[] visited = new boolean[dungeons.length];

        dfs(k, 0, visited, dungeons);

        return answer;
    }
}