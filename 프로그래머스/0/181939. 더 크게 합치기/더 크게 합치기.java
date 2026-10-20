class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        // int c = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        // int d = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        int c = Integer.parseInt(""+a+b);
        int d = Integer.parseInt(""+b+a);
        
        answer = (c > d ? c : d);
        
        return answer;
    }
}