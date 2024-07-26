import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int sum=0;
        int avg;
        int n=sc.nextInt();
        int[] ar=new int[n];
        int max=ar[0];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+ar[i];
        }
        avg=sum/n;
        for(int i=0;i<n;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }

        System.out.println("Sum is "+sum);
        System.out.println("Average is "+avg);
        System.out.println("Array is "+Arrays.toString(ar));
        System.out.println("The maximum number is "+max);
        }
    }
