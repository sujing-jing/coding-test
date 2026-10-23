class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        int[] day = new int[7];
        
        for (int i=0;i<7;i++) {
            day[i] = startday%7;
            startday++;
        }
        
        int p = 0;
        
        for(int[] person : timelogs) {
            int check = 0;
            for(int i=0;i<7;i++) {
                if(day[i]==6 || day[i]==0) {
                    continue;
                }
                if(person[i]<=plustime(schedules[p])){
                    check++;
                }
            }
            if (check == 5) {
                answer++;
            }
            p++;
        }
        
        return answer;
    }
    
    public int hour(int time) {
        return time/100;
    }
    
    public int min(int time) {
        return time%100;
    }
    
    public int plustime(int time) {
        int min = min(time) + 10;
        int hour = hour(time);
        if(min>=60){
            min %= 60;
            hour++;
        }
        return 100*hour + min;
    }
    
}