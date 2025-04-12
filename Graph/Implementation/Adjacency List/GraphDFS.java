import java.util.*;

public class GraphDFS {

    // Method to add an edge to an undirected graph
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // DFS traversal from a given source node
    static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj);
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 1, 3);

        // Print adjacency list
        System.out.println("Adjacency List:");
        for (int i = 1; i <= n; i++) {
            System.out.print("Node " + i + ": ");
            for (int neighbor : adj.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        // Perform DFS
        boolean[] visited = new boolean[n + 1]; // +1 to match 1-based indexing
        System.out.print("DFS starting from node 1: ");
        dfs(1, visited, adj);
        System.out.println();
    }
}
