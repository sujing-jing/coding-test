class Solution {
    public String[] solution(String my_str, int n) {
        int num = my_str.length()%n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[num];
        
        int start = 0;
        int end = n;
        
        for(int i=0;i<num-1;i++) {
            answer[i] = my_str.substring(start, end);
            start += n;
            end += n;
        }
        
        answer[num-1] = my_str.substring(start);
        
        return answer;
    }
}