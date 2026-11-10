class Solution {
    
    static int answer = 0;
    
    static void backtrack(int[] nums, int start, int count, int total) {
        if(count == 3) {
            for(int i=2;i<=Math.sqrt(total);i++) {
                if(total % i == 0) {
                    return;
                }
            }
            answer++;
            return;
        }
        
        for(int i=start; i<nums.length; i++) {
            backtrack(nums, i+1, count+1, total+nums[i]);
        }
    }
    
    public int solution(int[] nums) {

        backtrack(nums, 0, 0, 0);

        return answer;
    }
}