package DataStructure.examples;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS_BFS {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.DFS(0);
        g.BFS(0);
    }
}

class Graph{
    int V;
    LinkedList<Integer> adjList[];

    Graph(int V){
        this.V = V;
        adjList = new LinkedList[V];
        for(int i=0; i<V; i++){
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest){
        adjList[src].add(dest);
    }

    void DFS(int start){
        boolean visited[] = new boolean[V];
        DFSUtil(start, visited);
    }

    void BFS(int start){
        boolean visited[] = new boolean[V];
        BFSUtil(start, visited);
    }

    void BFSUtil(int start, boolean visited[]){
        LinkedList<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while(queue.size() != 0){
            start = queue.poll();
            System.out.print(start + " ");

            Iterator<Integer> i = adjList[start].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    void DFSUtil(int start, boolean visited[]){
        visited[start] = true;
        System.out.print(start + " ");

        Iterator<Integer> i = adjList[start].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if(!visited[n]){
                DFSUtil(n, visited);
            }
        }
    }
}
