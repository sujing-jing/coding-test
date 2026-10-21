class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int cnt = total / num;
        
        int cntidx = num % 2 == 1 ? (num - 1) / 2 : (num / 2) - 1;
        
        for(int i=0;i<num;i++) {
                answer[i] = cnt - cntidx + i;
        }
        
        return answer;
    }
}