class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        // if(a==b && b==c) {
        //     answer = 27 * (int) Math.pow(a, 6);
        // } else if (a!=b && b!=c && c!=a) {
        //     answer = a + b + c;
        // } else {
        //     answer = (a + b + c) * (a*a + b*b + c*c);
        // }
        
        answer = a + b + c;
        
        if(a==b && b==c) {
            answer = answer * 9 * (int) Math.pow(a, 5);
        } else if (a==b || b==c || c==a) {
            answer = answer * (a*a + b*b + c*c);
        }
        
        return answer;
    }
}