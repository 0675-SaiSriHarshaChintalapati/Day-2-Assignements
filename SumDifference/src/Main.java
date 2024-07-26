import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);*/
        // Average
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int avg;
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        avg = sum / n;


        System.out.println(avg);
    }
}
