import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if(str.length()>=1 && str.length()<=1000000) {
            System.out.println(str);
       }
        
        sc.close();
    }
}