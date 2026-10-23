class Solution {
    public int solution(int n, int w, int num) {
        int answer = 1;
        
        int period = 2 * w;
        
        for(int i=num;i<n;i+=period) {
            if(i+period<=n) {
                answer = answer + 2;
            } else if(i>(n/w-1)*w && i<=(n-(n%w)*2)) {
                break;
            } else if(i>(n-n%w)) {
                break;
            } else {
                answer = answer + 1;
            }
        }
        
        return answer;
    }
}