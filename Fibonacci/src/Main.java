import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        if(n==1) {
            System.out.println(a);
        }
        if(n==2) {
            System.out.println(a);
            System.out.println(b);
        }
        else{
            System.out.println(a);
            for(int i=1;i<n;i++){

                a=b;
                b=c;
                c=a+b;
                System.out.println(c);
            }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it
        }
    }
}