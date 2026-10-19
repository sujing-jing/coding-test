import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(Math.abs(a)<=100 && Math.abs(b)<=100) {
            System.out.printf("%d + %d = %d", a, b, a+b);
        }
        
        sc.close();
    }
}