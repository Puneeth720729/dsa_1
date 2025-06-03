


import java.util.*;
class Solution{
    static void dfs(ArrayList<ArrayList<Integer>> al,int v)
    {
        boolean vis[]=new boolean[v];
        for(int i=0;i<v;i++){
        if(vis[i]==false)
        {
            helper(al,i,vis);
        }
    }
    }
    static void helper(ArrayList<ArrayList<Integer>> al,int s,boolean vis[])
    {
        vis[s]=true;
        System.out.print(s+" ");
        for(int adj :al.get(s))
        {
            if(vis[adj]==false)
            {
                helper(al,adj,vis);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            al.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++)
        {
            int s=sc.nextInt();
            int d=sc.nextInt();
            al.get(s).add(d);
            al.get(d).add(s);
        }
       
        dfs(al,v);
        sc.close();
    }
}
