class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] si = new String[s.length()];
        si = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String a : si) {
            max = Math.max(max, Integer.parseInt(a));
            min = Math.min(min, Integer.parseInt(a));
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}