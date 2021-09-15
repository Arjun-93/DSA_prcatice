package Revise_DSA.Graphs;
import java.util.LinkedList;

public class Create_weightedGraph {
    public class WeightedGraph {
        static class Edge {
            int source;
            int destination;


            public Edge(int source, int destination) {
                this.source = source;
                this.destination = destination;
            }
        }

        static class Graph {
            int vertices;
            LinkedList<Edge>[] adjacencylist;

            Graph(int vertices) {
                this.vertices = vertices;
                adjacencylist = new LinkedList[vertices];
                //initialize adjacency lists for all the vertices
                for (int i = 0; i < vertices; i++) {
                    adjacencylist[i] = new LinkedList<>();
                }
            }

            public void addEgde(int source, int destination, int weight) {
                Edge edge = new Edge(source, destination);
                adjacencylist[source].addFirst(edge); //for directed graph
            }

            public void printGraph() {
                for (int i = 0; i < vertices; i++) {
                    LinkedList<Edge> list = adjacencylist[i];
                    for (int j = 0; j < list.size(); j++) {
                    }
                }
            }

            public static void main(String[] args) {

            }
        }
    }
}
