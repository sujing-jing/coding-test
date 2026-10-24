// import java.util.*;

// class Solution {
//     public int solution(int[][] sizes) {
//         int answer = 0;
//         int[] w = new int[sizes.length];
//         int[] h = new int[sizes.length];
        
//         for(int i=0;i<sizes.length;i++) {
//             Arrays.sort(sizes[i]);
//             w[i] = sizes[i][0];
//             h[i] = sizes[i][1];
//         }
        
//         Arrays.sort(w);
//         Arrays.sort(h);
//         answer = w[sizes.length-1] * h[sizes.length-1];
        
        
//         return answer;
//     }
// }

class Solution {
    public int solution(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
}