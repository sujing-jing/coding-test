class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String a : babbling) {
            
            if(a.contains("ayaaya") || a.contains("yeye") || a.contains("woowoo") || a.contains("mama")) {
                continue;
            }
            
//             a = a.replace("aya", " ");
//             a = a.replace("ye", " ");
//             a = a.replace("woo", " ");
//             a = a.replace("ma", " ");
            
//             answer = a.trim().isEmpty() ? answer + 1 : answer;
            
            a = a.replace("aya", "1");
            a = a.replace("ye", "1");
            a = a.replace("woo", "1");
            a = a.replace("ma", "1");
            a = a.replace("1", "");
            
            answer = a.equals("") ? answer + 1 : answer;
            
        }
        
        return answer;
    }
}