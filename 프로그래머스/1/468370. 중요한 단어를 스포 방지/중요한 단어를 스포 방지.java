
import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        int n = message.length();
        boolean[] spoiler = new boolean[n];

        // 1. 스포 방지 구간에 포함된 문자 표시
        for (int[] range : spoiler_ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                spoiler[i] = true;
            }
        }

        Set<String> normalWords = new HashSet<>();
        List<String> spoilerWords = new ArrayList<>();

        // 2. 단어별로 스포 방지 여부 확인
        int i = 0;

        while (i < n) {
            int start = i;

            while (i < n && message.charAt(i) != ' ') {
                i++;
            }

            String word = message.substring(start, i);
            boolean isSpoiler = false;

            for (int j = start; j < i; j++) {
                if (spoiler[j]) {
                    isSpoiler = true;
                    break;
                }
            }

            if (isSpoiler) {
                spoilerWords.add(word);
            } else {
                normalWords.add(word);
            }

            i++; // 공백 건너뛰기
        }

        // 3. 중요한 단어 개수 계산
        Set<String> seen = new HashSet<>();
        int answer = 0;

        for (String word : spoilerWords) {
            if (!normalWords.contains(word) && seen.add(word)) {
                answer++;
            }
        }

        return answer;
    }
}
