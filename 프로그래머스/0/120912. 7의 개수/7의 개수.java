class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int num : array) {
            String snum = String.valueOf(num);
            for (char seven : snum.toCharArray()) {
                if(seven == '7') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}