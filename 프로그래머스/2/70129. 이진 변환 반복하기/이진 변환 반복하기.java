class Solution {
    public int[] solution(String s) {
        int trans = 0;
        int del = 0;
        
        while(!s.equals("1")) {
            String ans = "";
            for(char a : s.toCharArray()) {
                if(a == '0') {
                    del++;
                } else {
                    ans += a;
                }
            }
            s = Integer.toBinaryString(ans.length());
            trans++;
        }

        
        int[] answer = {trans, del};
        
        return answer;
    }
}