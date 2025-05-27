import java.util.*;
public class Main{
    static int maxSumSubarray(int[] a,int n){
        int current=a[0];
        int max=a[0];
        for(int i=1;i<n;i++){
            current=Math.max(a[i],current+a[i]);
            max=Math.max(max,current);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("max sum is:"+maxSumSubarray(a,n));
    }
}
