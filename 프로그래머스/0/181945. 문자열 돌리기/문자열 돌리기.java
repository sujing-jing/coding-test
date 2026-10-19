import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if(Math.abs(str.length())<=10) {
            for(int i=0;i<str.length();i++) {
                System.out.println(str.charAt(i));
            }
        }
        
        sc.close();
    }
}