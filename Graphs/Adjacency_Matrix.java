import java.util.Scanner;

public class GraphAdjMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        int[][] adjMatrix = new int[vertices][vertices];

        System.out.println("Enter edges (source and destination):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt(); // source
            int v = sc.nextInt(); // destination
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1; // Remove this line if it's a directed graph
        }

        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
