class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
/*        for(int i=0;i<arr.length;i++) {
            answer += arr[i];
        }
        */
        
//        answer = String.join("", arr);
        
        for(String a : arr) {
            answer += a;
        }
        
        return answer;
    }
}