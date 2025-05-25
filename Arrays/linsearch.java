import java.util.*;
public class Main{
    static int linsearch(int[] a,int target){
        int ans=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                ans=i;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int index=linsearch(a,target);
        System.out.println(index);
    }
}
