import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        int n = message.length();
        boolean[] spoiler = new boolean[n];

        // 1. 스포일러 구간에 포함된 문자 표시
        for (int[] range : spoiler_ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                spoiler[i] = true;
            }
        }

        Set<String> normalWords = new HashSet<>();
        Set<String> spoilerWords = new HashSet<>();

        // 2. 단어별로 스포일러 여부 확인
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

        // 3. 일반 단어에 존재하는 단어 제거
        spoilerWords.removeAll(normalWords);

        // 4. 남은 서로 다른 스포일러 단어 개수 반환
        return spoilerWords.size();
    }
}