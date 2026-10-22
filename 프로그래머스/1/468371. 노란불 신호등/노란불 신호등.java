class Solution {
    public int solution(int[][] signals) {
        long lcm = 1;

        // 모든 신호등 주기의 최소공배수 구하기
        for (int[] s : signals) {
            int period = s[0] + s[1] + s[2];
            lcm = lcm / gcd(lcm, period) * period;
        }

        // 1초부터 모든 신호등이 노란불인지 확인
        for (long t = 1; t <= lcm; t++) {
            boolean allYellow = true;

            for (int[] s : signals) {
                int green = s[0];
                int yellow = s[1];
                int period = s[0] + s[1] + s[2];

                long phase = (t - 1) % period;

                if (phase < green || phase >= green + yellow) {
                    allYellow = false;
                    break;
                }
            }

            if (allYellow) {
                return (int) t;
            }
        }

        return -1;
    }

    // 최대공약수
    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}