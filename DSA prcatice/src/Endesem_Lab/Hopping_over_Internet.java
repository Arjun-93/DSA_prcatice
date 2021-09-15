package Endesem_Lab;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Hopping_over_Internet {
    public class Graph {
        static class Edge {
            int a;
            int b;
            int c;

            public Edge(int a, int b, int c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }
        }
        static class Node {
            int n;
            LinkedList<Hopping_over_Internet.Graph.Edge>[] adjacencylist;
            Node(int n) {
                this.n = n;
                adjacencylist = new LinkedList[n];
                for (int i = 0; i < n; i++) {
                    adjacencylist[i] = new LinkedList<>();
                }
            }

            public static void main(String[] args) throws IOException {
                Reader.init(System.in);
                int n = Reader.nextInt();
                int m = Reader.nextInt();
                new Node(n);
                int i;
                int sum = 0;
                for (i = 0; i <= m; i++) {
                    int a = Readerr.nextInt();
                    int b = Readerr.nextInt();
                    int c = Readerr.nextInt();
                    sum = 0;
                    sum = sum + c;
                    new Edge(a, b, c);
                }
                int j;
                for (j = 0; j <= n; j++) {
                    int k = Readerr.nextInt();
                }
                System.out.println(sum);
            }
        }
    }
}



class Readerr {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine() );
        }
        return tokenizer.nextToken();
    }
    static String nextLine() throws IOException {
        return reader.readLine();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
}
