import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,-2,3,4,5};
        int j=0;
        int k=0;
        int[] a=new int[10];
        int[] b=new int[10];
        for (int value : arr) {
            if (value < 0) {
                a[j++] = value;
            } else {
                b[k++] = value;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}