import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int j = 0;
        
        for (int[] cmd : commands) {
            int[] narr = new int[cmd[1]-cmd[0]+1];
            for (int i = cmd[0]-1;i<cmd[1];i++){
                narr[i-cmd[0]+1] = array[i];
            }
            Arrays.sort(narr);
            answer[j] = narr[cmd[2]-1];
            j++;
        }
        
        
        
        
        return answer;
    }
}