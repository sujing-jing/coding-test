import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> total = new HashMap<>();
        Map<String, List<int[]>> songs = new HashMap<>();

        // 1. 장르별 총 재생 횟수와 노래 정보 저장
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];

            total.put(genre, total.getOrDefault(genre, 0) + plays[i]);

            songs.putIfAbsent(genre, new ArrayList<>());
            songs.get(genre).add(new int[]{i, plays[i]});
        }

        // 2. 장르를 총 재생 횟수가 많은 순서로 정렬
        List<String> genreList = new ArrayList<>(total.keySet());

        genreList.sort((a, b) -> total.get(b) - total.get(a));

        // 3. 장르별로 노래를 정렬하고 최대 두 곡 선택
        List<Integer> answer = new ArrayList<>();

        for (String genre : genreList) {
            List<int[]> songList = songs.get(genre);

            songList.sort((a, b) -> {
                if (a[1] != b[1]) {
                    return b[1] - a[1];
                }
                return a[0] - b[0];
            });

            for (int i = 0; i < Math.min(2, songList.size()); i++) {
                answer.add(songList.get(i)[0]);
            }
        }

        // 4. List<Integer>를 int[]로 변환
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}