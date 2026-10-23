// class Solution {
//     public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
//         String answer = "";
//         int current = inttime(pos);
//         if(current >= inttime(op_start) && current <= inttime(op_end)) {
//             current = inttime(op_end);
//         }
        
//         for(String c : commands) {
//             switch(c) {
//                 case "next" :
//                     current = next(current, video_len, op_start, op_end);
//                     break;
//                 case "prev" :
//                     current = prev(current, op_start, op_end);
//                     break;
//             }
//         }
        
//         String min = String.valueOf(current/100);
//         if (current/100 < 10) {
//             min = "0" + min;
//         }
//         String sec = String.valueOf(current%100);
//         if (current%100 < 10) {
//             sec = "0" + sec;
//         }
        
//         answer = min + ":" + sec;
        
//         return answer;
//     }
    
//     public int inttime(String strtime) {
//         String[] tmp = strtime.split(":");
//         int time = Integer.parseInt(tmp[0]) * 100 + Integer.parseInt(tmp[1]);
//         return time;
//     } 
    
//     public int next(int current, String video_len, String op_start, String op_end) {
//         current += 10;
//         if(current%100 >= 60) {
//             current += 40;
//         }
//         if(current > inttime(video_len)) {
//             current = inttime(video_len);
//         }
//         if(current >= inttime(op_start) && current <= inttime(op_end)) {
//             current = inttime(op_end);
//         }
//         return current;
//     }
    
//     public int prev(int current, String op_start, String op_end) {
//         current -= 10;
//         if(current%100 >= 60) {
//             current -= 40;
//         }
//         if(current<0) {
//             current = 0;
//         }
//         if(current >= inttime(op_start) && current <= inttime(op_end)) {
//             current = inttime(op_end);
//         }
//         return current;
//     }
// }

class Solution {

    public int convertToSeconds(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 각 시간들 초로 변환
        int videoLenSec = convertToSeconds(video_len),
            posSec = convertToSeconds(pos),
            opStartSec = convertToSeconds(op_start),
            opEndSec = convertToSeconds(op_end);

        if (posSec >= opStartSec && posSec <= opEndSec) posSec = opEndSec; // 시작 값 오프닝 구간 확인

        for (String command : commands) {
            if (command.equals("next")) posSec = posSec + 10 >= videoLenSec ? videoLenSec : posSec + 10;
            else posSec = posSec - 10 > 0 ? posSec - 10 : 0;

            if (posSec >= opStartSec && posSec <= opEndSec) posSec = opEndSec; // 오프닝 구간 확인
        }

        int m = posSec / 60,
            s = posSec % 60;

        String answer = "";     // StringBuilder 쓸정도 아님
        answer += m < 10 ? "0" + m : m + "";
        answer += ":";
        answer += s < 10 ? "0" + s : s + "";

        return answer;
    }
}