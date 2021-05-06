package com.ca.mahima.graph;

import java.util.LinkedList;

/*
 *  time complexity of BFS is O(V + E) when Adjacency List is used.
 * */
public class BfsGraph {
    private static LinkedList<Integer> adj[];

    public static void main(String[] args) {
        int v = 4;
        Graph g = new Graph(v);
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
        g.addEdge(0, 1, adj);
        g.addEdge(0, 2, adj);
        g.addEdge(1, 2, adj);
        g.addEdge(2, 0, adj);
        g.addEdge(2, 3, adj);
        g.addEdge(3, 3, adj);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");
        //2 is the source node
        BFS(2, v);
    }

    public static void BFS(int s, int v) {
        boolean[] visited = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;
        while (!queue.isEmpty()) {

            s = queue.poll();
            System.out.print(s + " ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            adj[s].forEach(x -> {
                if (!visited[x]) {
                    visited[x] = true;
                    queue.add(x);
                }
            });
        }

    }
}
