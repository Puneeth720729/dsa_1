import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int maj=a[0],count=1;
        for(int i=1;i<n;i++){
            if(a[i]==maj){
                count=count+1;
            }else{
                count=count-1;
            }
            if(count==0){
                maj=a[i];
                count=1;
            }
        }
        System.out.println(maj);
    }
}
