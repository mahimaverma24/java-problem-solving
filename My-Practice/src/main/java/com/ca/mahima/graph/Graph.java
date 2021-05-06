package com.ca.mahima.graph;


import java.util.LinkedList;

public class Graph {

    private int v;

    public Graph(int v) {
        this.v = v;
    }

    void addEdge(int v, int w, LinkedList<Integer> adj[]) {
        adj[v].add(w);
    }
}
