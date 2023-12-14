//creating a basic graph
package graph;

import java.util.HashMap;
import java.util.LinkedList;

class Graph{
    int vertices;
    HashMap<Integer, LinkedList<Integer>> adjList = new HashMap<>();
    Graph(int x){
        this.vertices = x;
        for(int i=1;i<=x;i++){
            adjList.put(i, new LinkedList<>()); //key=i, value=linkedlist
        }
    }
    void addEdge(int src, int dst) {
        //bidirectional graph
        adjList.get(src).add(dst);
        adjList.get(dst).add(src);
    }
    void print(){
        for(int key : adjList.keySet()){ //traversing through each key
            System.out.print(key+" : ");
            for(int list : adjList.get(key)){ //traversing through each node of the linkedlist of each key
                System.out.print(list);
                if(!(adjList.get(key).indexOf(list) == adjList.get(key).size()-1)){
                    System.out.print("-->");
                }
            }
            System.out.println();
        }
    }
}
public class basic {
    public static void main(String[] args){
        Graph graph = new Graph(5); //x = number of vertices
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,5);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.print();
    }
}
