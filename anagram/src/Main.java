

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int count=0;
    String s="has";
    String a="ash";
    char[] b=s.toCharArray();
    char[] c=a.toCharArray();
    for(int i=0;i<b.length;i++){
        for(int j=0;j<c.length;j++){
            if(b[i]==c[j]){
                count++;
            }
        }
    }
    if(count==b.length &&count ==c.length){
        System.out.println("anagram");
    }
    else{
        System.out.println("Not");
    }
    }
}