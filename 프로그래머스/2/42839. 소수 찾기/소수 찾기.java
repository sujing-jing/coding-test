
import java.util.*;

class Solution {

    static Set<Integer> set = new HashSet<>();

    static void dfs(String numbers, String current, boolean[] visited) {

        // 현재까지 만든 숫자를 저장
        if(!current.isEmpty()) {
            set.add(Integer.parseInt(current));
        }

        for(int i = 0; i < numbers.length(); i++) {

            if(!visited[i]) {
                visited[i] = true;

                dfs(numbers, current + numbers.charAt(i), visited);

                // 백트래킹
                visited[i] = false;
            }
        }
    }

    // 소수 판별
    static boolean isPrime(int num) {

        if(num < 2) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int solution(String numbers) {

        set.clear();

        boolean[] visited = new boolean[numbers.length()];

        dfs(numbers, "", visited);

        int answer = 0;

        for(int num : set) {
            if(isPrime(num)) {
                answer++;
            }
        }

        return answer;
    }
}