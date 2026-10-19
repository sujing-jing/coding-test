import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        if(Math.abs(a.length())<=10 && Math.abs(b.length())<=10) {
            System.out.println(a+b);
        }
        
        sc.close();
    }
}