class Solution {
    public int solution(int n) {
        int answer = 2;
        
        // for(int i = 1; i <= 1000 ; i++) {
        //     int square = i * i;
        //     if(square == n) {
        //         answer = 1;
        //         break;
        //     }
        // }
        
        if(n % Math.sqrt(n) == 0) {
            answer = 1;
        }
        
        return answer;
    }
}