class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int a = s+overwrite_string.length();
        int b = my_string.length();
        for(int i=0;i<s;i++) {
            answer += my_string.charAt(i);
        }        
        answer += overwrite_string;
        if(a < b) {
            for(int i=a;i<b;i++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}