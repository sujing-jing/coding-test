class Solution {
    public String solution(String my_string) {
        String answer = "";
        String replace = "";
        
        for(char a : my_string.toCharArray()) {
            if (Character.isUpperCase(a)) {
                a = Character.toLowerCase(a);
            }
            replace += a;
        }
        
        char[] arr = replace.toCharArray();
        java.util.Arrays.sort(arr);
        answer = new String(arr);
        
        return answer;
    }
}