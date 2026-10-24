// class Solution {
//     public String solution(String s) {
//         String answer = "";
//         String tmp = "";
        
//         String[] split = s.split(" ");
        
//         for(String word : split) {
//             for(int i=0;i<word.length();i++) {
//                 char c = word.charAt(i);
//                 if(i==0) {
//                     tmp += Character.toUpperCase(c);
//                 } else {
//                     tmp += Character.toLowerCase(c);
//                 }
//             }
//             tmp += " ";
//         }
        
//         for (int i=0;i<tmp.length()-1;i++) {
//             answer += tmp.charAt(i);
//         }
        
//         return answer;
//     }
// }

class Solution {
    public String solution(String s) {
        String answer = "";
        boolean isFirst = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer += c;
                isFirst = true;
            } else {
                if (isFirst) {
                    answer += Character.toUpperCase(c);
                    isFirst = false;
                } else {
                    answer += Character.toLowerCase(c);
                }
            }
        }

        return answer;
    }
}