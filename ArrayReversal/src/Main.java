import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] ar=new int[5];
        int start=0;
        int end=ar.length-1;
        int temp;
    for(int i=0;i<5;i++){
        ar[i]=sc.nextInt();
    }
    while(start<=end){
        temp=ar[start];
        ar[start]=ar[end];
        ar[end]=temp;
        start++;
        end--;
    }
        System.out.println(Arrays.toString(ar));

    }
}