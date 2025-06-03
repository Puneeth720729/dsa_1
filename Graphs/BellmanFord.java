import java.util.*;

class Edge {  
    int u, v, w;
    Edge(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }
}

class Solution {
    static void bellman(ArrayList<Edge> al, int v, int s) {
        int dis[] = new int[v];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[s] = 0;

        
        for (int i = 0; i < v - 1; i++) {
            for (Edge e : al) {
                if (dis[e.u] != Integer.MAX_VALUE && dis[e.u] + e.w < dis[e.v]) {
                    dis[e.v] = dis[e.u] + e.w;
                }
            }
        }

        
        for (Edge e : al) {
            if (dis[e.u] != Integer.MAX_VALUE && dis[e.u] + e.w < dis[e.v]) {
                System.out.println("-1");  
            }
        }

        
        for (int i = 0; i < v; i++) {
            System.out.print((dis[i] == Integer.MAX_VALUE ? -1 : dis[i]) + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<Edge> al = new ArrayList<>();

        for (int i = 0; i < e; i++) {
            int eu = sc.nextInt();
            int ev = sc.nextInt();
            int ew = sc.nextInt();
            al.add(new Edge(eu, ev, ew));  
        }

        bellman(al, v, 0);
        sc.close();
    }
}
