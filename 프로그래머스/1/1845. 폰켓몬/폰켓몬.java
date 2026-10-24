import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int getp = nums.length/2;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int type : nums) {
            map.put(type, map.getOrDefault(nums, 0) + 1);
        }
        
        if(map.size()>=getp) {
            answer = getp;
        } else {
            answer = map.size();
        }
        
        return answer;
    }
}