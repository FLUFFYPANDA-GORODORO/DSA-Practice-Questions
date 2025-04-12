import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class GraphBFS {

    // Method to add an edge to an undirected graph
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // BFS traversal from a given source node
    static void bfs(int start, ArrayList<ArrayList<Integer>> adj, int n) {
        boolean[] visited = new boolean[n + 1]; // +1 because nodes start at 1
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS starting from node " + start + ": ");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
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

        // Perform BFS
        bfs(1, adj, n);
    }
}
