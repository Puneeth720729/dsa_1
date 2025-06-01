import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0],min=a[0],ans=a[0];
        for(int i=1;i<n;i++){
            if(a[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(a[i],max*a[i]);
            min=Math.min(a[i],min*a[i]);
            ans=Math.max(ans,max);
        }
        System.out.println(ans);
    }
}
