class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int current = inttime(pos);
        if(current >= inttime(op_start) && current <= inttime(op_end)) {
            current = inttime(op_end);
        }
        
        for(String c : commands) {
            switch(c) {
                case "next" :
                    current = next(current, video_len, op_start, op_end);
                    break;
                case "prev" :
                    current = prev(current, op_start, op_end);
                    break;
            }
        }
        
        String min = String.valueOf(current/100);
        if (current/100 < 10) {
            min = "0" + min;
        }
        String sec = String.valueOf(current%100);
        if (current%100 < 10) {
            sec = "0" + sec;
        }
        
        answer = min + ":" + sec;
        
        return answer;
    }
    
    public int inttime(String strtime) {
        String[] tmp = strtime.split(":");
        int time = Integer.parseInt(tmp[0]) * 100 + Integer.parseInt(tmp[1]);
        return time;
    } 
    
    public int next(int current, String video_len, String op_start, String op_end) {
        current += 10;
        if(current%100 >= 60) {
            current += 40;
        }
        if(current > inttime(video_len)) {
            current = inttime(video_len);
        }
        if(current >= inttime(op_start) && current <= inttime(op_end)) {
            current = inttime(op_end);
        }
        return current;
    }
    
    public int prev(int current, String op_start, String op_end) {
        current -= 10;
        if(current%100 >= 60) {
            current -= 40;
        }
        if(current<0) {
            current = 0;
        }
        if(current >= inttime(op_start) && current <= inttime(op_end)) {
            current = inttime(op_end);
        }
        return current;
    }
}