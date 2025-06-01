import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s1 = "";
        String s2  = "";
        while(n>0){
            s1=s1+n%2;
            s2=n%2+s2;
            n=n/2;
            
        }
        if(s1.equals(s2)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
