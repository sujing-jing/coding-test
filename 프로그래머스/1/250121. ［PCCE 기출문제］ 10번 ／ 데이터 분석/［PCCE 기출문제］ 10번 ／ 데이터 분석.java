
import java.util.*;

class Solution {
    public ArrayList<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extn = 0;
        int sortn = 0;

        switch(ext) {
            case "date":
                extn = 1;
                break;
            case "maximum":
                extn = 2;
                break;
            case "remain":
                extn = 3;
                break;
        }

        switch(sort_by) {
            case "date":
                sortn = 1;
                break;
            case "maximum":
                sortn = 2;
                break;
            case "remain":
                sortn = 3;
                break;
        }

        ArrayList<int[]> answer = new ArrayList<>();

        for(int i = 0; i < data.length; i++) {
            if(data[i][extn] < val_ext) {
                answer.add(data[i]);
            }
        }

        final int sortIndex = sortn;

        Collections.sort(answer, (a, b) -> {
            return a[sortIndex] - b[sortIndex];
        });

        return answer;
    }
}


// import java.util.*;

// class Solution {
//     public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
//         String[] types = {"code", "date", "maximum", "remain"};

//         int extIndex = Arrays.asList(types).indexOf(ext);
//         int sortIndex = Arrays.asList(types).indexOf(sort_by);

//         return Arrays.stream(data)
//                 .filter(row -> row[extIndex] < val_ext)
//                 .sorted(Comparator.comparingInt(row -> row[sortIndex]))
//                 .toArray(int[][]::new);
//     }
// }