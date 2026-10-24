// class Solution {
//     public int[] solution(String s) {
//         int trans = 0;
//         int del = 0;
        
//         while(!s.equals("1")) {
//             String ans = "";
//             for(char a : s.toCharArray()) {
//                 if(a == '0') {
//                     del++;
//                 } else {
//                     ans += a;
//                 }
//             }
//             s = Integer.toBinaryString(ans.length());
//             trans++;
//         }

        
//         int[] answer = {trans, del};
        
//         return answer;
//     }
// }

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int temp;
        while( !s.equals("1") ) {
            answer[1] += s.length();
            s = s.replaceAll("0", "");
            temp = s.length();
            s = Integer.toBinaryString(temp);
            //System.out.println("s : " + s ); 
            answer[0]++;
            answer[1] -= temp;
        }
        return answer;  
    }
}