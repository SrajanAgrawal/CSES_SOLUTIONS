import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int [n];
        long flag=0;
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                flag+=(arr[i]-arr[i+1]);
            arr[i+1]=arr[i];
            }
        }
        System.out.print(flag);
    }
}
