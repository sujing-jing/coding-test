class Solution {
    
    static int answer = 0;
    
    static void backtrack(int[] number, int start, int count, int total) {
                       
        if(count == 3) {
            if(total == 0) {
                answer++;
            }
            return;
        }
            
        for(int i=start;i<number.length;i++) {
            backtrack(number, i+1, count+1, total+number[i]);
        }
    }
    
    public int solution(int[] number) {
        
        backtrack(number, 0, 0, 0);
        
        return answer;
    }
}