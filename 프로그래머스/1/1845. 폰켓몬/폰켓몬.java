import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int getp = nums.length/2;
        
        Set<Integer> list = new HashSet<>();
        
        for(int type : nums) {
            list.add(type);
        }
        
        if(list.size()>=getp) {
            answer = getp;
        } else {
            answer = list.size();
        }
        
        return answer;
    }
}