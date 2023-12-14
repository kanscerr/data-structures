package search;

import java.util.*;

class Graph{
    int vertices;
    HashMap<Integer, LinkedList<Integer>> adjList = new HashMap<>();
    Graph(int x){
        this.vertices = x;
        for(int i=1;i<=x;i++){
            adjList.put(i, new LinkedList<>());
        }
    }
    void addEdge(int src, int dest){
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }
    void breadthFirstSearch(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        for(int key : adjList.keySet()){
            System.out.print(key+" ");
            queue.remove(key);
            for(int value : adjList.get(key)){
                queue.add(value);
            }
        }
    }
}
public class bfs {
    public static void main(String[] args){
        Graph graph = new Graph(5);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,5);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.breadthFirstSearch();
    }
}
