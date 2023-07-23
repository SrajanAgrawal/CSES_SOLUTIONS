import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t= sc.next();
        int p=1;
        int flag=1;
        for(int i=0;i<t.length()-1;i++){
            if(t.charAt(i)==t.charAt(i+1))
                flag++;
            else flag=1;
            if(flag>p) p=flag;
        }
        System.out.println(p);
    }
}
