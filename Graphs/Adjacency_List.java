import java.util.ArrayList;
import java.util.Scanner;

public class GraphAdjList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }

        System.out.println("Enter edges (source and destination):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt(); // source
            int v = sc.nextInt(); // destination
            adjList.get(u).add(v);
            adjList.get(v).add(u); // Remove this line for directed graph
        }

        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
