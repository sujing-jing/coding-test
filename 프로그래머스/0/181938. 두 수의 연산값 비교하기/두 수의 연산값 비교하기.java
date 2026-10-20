class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
//         int c = Integer.parseInt(""+a+b);
//         int d = 2 * a * b;
        
//         answer = (c >= d ? c : d);
        
        answer = Math.max(Integer.parseInt(""+a+b), 2*a*b);
        
        return answer;
    }
}