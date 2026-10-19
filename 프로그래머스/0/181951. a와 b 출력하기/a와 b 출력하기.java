import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(Math.abs(a)<=1000000) {
            System.out.println("a = " + a);
        }
        
        if(Math.abs(b)<=1000000) {
            System.out.println("b = " + b);
        }

        sc.close();
    }
}