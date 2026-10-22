class Solution {
    public int solution(int[] array) {
        int answer = 0;
        // for (int num : array) {
        //     String snum = String.valueOf(num);
        //     for (char seven : snum.toCharArray()) {
        //         if(seven == '7') {
        //             answer++;
        //         }
        //     }
        // }
        
        for(int num : array) {
            while(num != 0) {
                if(num % 10 == 7) {
                    answer++;
                }
                num = num / 10;
            }
        }
        
        return answer;
    }
}