import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Arrays;

class Solution {
    public int[] solution(int m, int n, int h, int w, int[][] drops) {
        int len = drops.length;
        int[][] rain = new int[m][n];

        // 1. 각 칸에 처음 비가 내리는 시점 기록
        // 비가 오지 않는 칸은 len + 1
        // for (int r = 0; r < m; r++) {
        //     for (int c = 0; c < n; c++) {
        //         rain[r][c] = len + 1;
        //     }
        // }
        
        for (int[] tmp : rain) {
            Arrays.fill(tmp, len+1);
        }

        for (int i = 0; i < len; i++) {
            int r = drops[i][0];
            int c = drops[i][1];
            rain[r][c] = i + 1;
        }

        // 2. 가로 방향 길이 w 구간의 최솟값
        int[][] horizontal = new int[m][n - w + 1];

        for (int r = 0; r < m; r++) {
            Deque<Integer> deque = new ArrayDeque<>();

            for (int c = 0; c < n; c++) {
                while (!deque.isEmpty()
                        && deque.peekFirst() <= c - w) {
                    deque.pollFirst();
                }

                while (!deque.isEmpty()
                        && rain[r][deque.peekLast()] >= rain[r][c]) {
                    deque.pollLast();
                }

                deque.offerLast(c);

                if (c >= w - 1) {
                    horizontal[r][c - w + 1] =
                            rain[r][deque.peekFirst()];
                }
            }
        }

        // 3. 세로 방향 길이 h 구간의 최솟값
        int rows = m - h + 1;
        int cols = n - w + 1;
        int[][] minRain = new int[rows][cols];

        for (int c = 0; c < cols; c++) {
            Deque<Integer> deque = new ArrayDeque<>();

            for (int r = 0; r < m; r++) {
                while (!deque.isEmpty()
                        && deque.peekFirst() <= r - h) {
                    deque.pollFirst();
                }

                while (!deque.isEmpty()
                        && horizontal[deque.peekLast()][c]
                        >= horizontal[r][c]) {
                    deque.pollLast();
                }

                deque.offerLast(r);

                if (r >= h - 1) {
                    minRain[r - h + 1][c] =
                            horizontal[deque.peekFirst()][c];
                }
            }
        }

        // 4. 가장 늦게 비를 맞는 구역 선택
        // 같은 값이면 행, 열 순서상 먼저 나온 위치 유지
        int bestTime = -1;
        int[] answer = new int[2];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (minRain[r][c] > bestTime) {
                    bestTime = minRain[r][c];
                    answer[0] = r;
                    answer[1] = c;
                }
            }
        }

        return answer;
    }
}