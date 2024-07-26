import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String a=sc.next();
        char[] ch=s.toCharArray();
        for(int i= ch.length-1;i>=0;i--){
            a=a+ch[i];
        }
        System.out.println(a);
        if(s.equals(a)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}