import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> result = new ArrayList<>();
        
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        
        for(int i=0;i<answers.length;i++) {
            if(num1[i%5] == answers[i]) {
                score[0]++;
            }
            if(num2[i%8] == answers[i]) {
                score[1]++;
            }
            if(num3[i%10] == answers[i]) {
                score[2]++;
            }
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        for(int i=0;i<score.length;i++) {
            if(score[i]==max){
                result.add(i+1);
            }
        }
        
        // int[] answer = result.stream().mapToInt(Integer::intValue).toArray();
        
        int[] answer = new int[result.size()];
        
        for(int i=0;i<result.size();i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}