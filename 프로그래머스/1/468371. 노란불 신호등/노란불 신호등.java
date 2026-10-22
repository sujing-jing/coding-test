class Solution {
    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
    
    public boolean isYellow(int sec, int[] signal) {
        sec = sec % (signal[0] + signal[1] + signal[2]);
        return sec > signal[0] && sec <= signal[0] + signal[1];
    }
    
    public int solution(int[][] signals) {
        int answer = 0;
        
        int max = 1;
        
        for(int[] signal : signals) {
            int period = signal[0] + signal[1] + signal[2];
            max = lcm(max, period);
        }
        
        while (answer <= max) {
            boolean flag = true;
            
            for(int[] signal : signals) {
                flag = flag && isYellow(answer, signal);
            }
            
            if (flag) {
                return answer;
            }
            
            answer++;
        }
        
        return -1;
    }
}