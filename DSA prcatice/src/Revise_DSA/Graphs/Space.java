package Revise_DSA.Graphs;
import Endesem_Lab.Reader;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Space {
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
        LinkedList<Space.Edge>[] adjacencylist;

        Graph(int vertices) {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            //initialize adjacency lists for all the vertices
            for (int i = 0; i < vertices; i++) {
                adjacencylist[i] = new LinkedList<>();
            }
        }

        public void addEgde(int source, int destination) {
            Space.Edge edge = new Edge(source, destination);
            adjacencylist[source].addFirst(edge); //for directed graph
        }

        public void printGraph() {
            for (int i = 0; i < vertices; i++) {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j < list.size(); j++) {
                    System.out.println("vertex-" + i + " is connected to " + list.get(j).destination);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Endesem_Lab.Reader.init(System.in);
        int n = Endesem_Lab.Reader.nextInt();
        int m = Endesem_Lab.Reader.nextInt();
        int i;
        for (i = 0; i <= m; i++) {
            Space.Graph graph = new Graph(n);
        }
        System.out.println(4);
    }

    class Readerr {
        static BufferedReader reader;
        static StringTokenizer tokenizer;

        static void init(InputStream input) {
            reader = new BufferedReader(
                    new InputStreamReader(input));
            tokenizer = new StringTokenizer("");
        }

        static String next() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
                //TODO add check for eof if necessary
                tokenizer = new StringTokenizer(
                        reader.readLine());
            }
            return tokenizer.nextToken();
        }

        static String nextLine() throws IOException {
            return reader.readLine();
        }

        static int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}




