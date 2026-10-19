import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        if(str.length()>=1 && str.length()<=10) {
            if(n>=1 && n<=5) {
                System.out.println(str.repeat(n));
            }
        }
        
        sc.close();
        
    }
}