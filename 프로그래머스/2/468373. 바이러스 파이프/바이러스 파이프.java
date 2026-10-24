import java.util.*;

class Solution {
    static class Edge {
        int to;
        int type;

        Edge(int to, int type) {
            this.to = to;
            this.type = type;
        }
    }

    List<Edge>[] graph;
    int n;
    int k;
    int answer = 0;

    public int solution(int n, int infection, int[][] edges, int k) {
        this.n = n;
        this.k = k;

        // 1. 트리 생성
        graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int x = edge[0] - 1;
            int y = edge[1] - 1;
            int type = edge[2];

            graph[x].add(new Edge(y, type));
            graph[y].add(new Edge(x, type));
        }

        // 2. 초기 감염 상태 설정
        boolean[] infected = new boolean[n];
        infected[infection - 1] = true;

        // 3. 모든 행동 순서 탐색
        search(0, infected);

        return answer;
    }

    void search(int depth, boolean[] infected) {
        // 현재 감염된 노드 개수 계산
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (infected[i]) {
                count++;
            }
        }

        // 최댓값 갱신
        answer = Math.max(answer, count);

        // 최대 행동 횟수에 도달하면 종료
        if (depth == k) {
            return;
        }

        // A, B, C 파이프를 각각 선택
        for (int type = 1; type <= 3; type++) {
            boolean[] nextInfected = infected.clone();

            // 선택한 종류의 파이프를 통해 감염 전파
            spread(nextInfected, type);

            // 다음 행동 진행
            search(depth + 1, nextInfected);
        }
    }

    void spread(boolean[] infected, int type) {
        int[] queue = new int[n];
        int head = 0;
        int tail = 0;

        // 이미 감염된 노드를 모두 탐색 시작점으로 등록
        for (int i = 0; i < n; i++) {
            if (infected[i]) {
                queue[tail++] = i;
            }
        }

        // 선택한 종류의 파이프를 통해 감염 전파
        while (head < tail) {
            int current = queue[head++];

            for (Edge edge : graph[current]) {
                if (edge.type == type && !infected[edge.to]) {
                    infected[edge.to] = true;
                    queue[tail++] = edge.to;
                }
            }
        }
    }
}