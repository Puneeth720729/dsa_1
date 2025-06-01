import java.io.*;
import java.util.*;

public class Solution {
    static void quicksort(int[] a,int low,int high){
        if(low<high){
            int part=partition(a,low,high);
            quicksort(a,low,part-1);
            quicksort(a,part+1,high);
        }
    }
    static int partition(int[] a,int low,int high){
        int pivot = a[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(a[j]<=pivot){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;
        return i+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        quicksort(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
