class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int check = 0;
        
        for (int i=1;i<=A.length();i++) {
            if (A.equals(B)) {
                check++;
                break;
            }            
            A = A.charAt(A.length()-1) + A.substring(0, A.length()-1);
            answer++;
        }
        
        if(check == 0) {
            answer = -1;
        }
        
        return answer;
    }
}