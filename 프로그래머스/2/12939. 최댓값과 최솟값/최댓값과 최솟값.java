class Solution {
    public String solution(String s) {
//         String answer = "";
        
//         String[] si = new String[s.length()];
//         si = s.split(" ");
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
        
//         for(String a : si) {
//             max = Math.max(max, Integer.parseInt(a));
//             min = Math.min(min, Integer.parseInt(a));
//         }
        
//         answer = min + " " + max;
        
//         return answer;
        
        String[] tmp = s.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(tmp[0]);
        for (int i = 1; i < tmp.length; i++) {
                n = Integer.parseInt(tmp[i]);
            if(min > n) min = n;
            if(max < n) max = n;
        }

        return min + " " + max;
    }
}