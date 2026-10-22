class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        // answer = n * (int) Math.pow(2, t);
        answer = n << t;
        return answer;
    }
}