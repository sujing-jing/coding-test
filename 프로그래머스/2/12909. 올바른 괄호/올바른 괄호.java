// class Solution {
//     boolean solution(String s) {
        
//         char[] chs = new char[s.length()];
//         int open = 0;
//         int close = 0;
        
//         for(int i=0;i<s.length();i++) {
//             chs[i] = s.charAt(i);
//         }
        
//         if (chs[0] == ')') return false;
        
//         for (char a : chs) {
//             if(a == '(') {
//                 open++;
//             } else {
//                 close++;
//                 if(open<close) {
//                     return false;
//                 }
//             }
//         }
        
//         if(open == close) {
//             return true;
//         } else {
//             return false;
//         }

//     }
// }

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for(char a : s.toCharArray()){
            if(a == '('){
                count++;
            }
            if(a == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
    }
}