package Endesem_Lab;
import java.util.LinkedList;
import java.util.Scanner;

public class QuestionB {

    public static class Q2 {
        private LinkedList<Integer> adj[];
        public Q2(int v){
            adj = new LinkedList[v];
            for (int i = 0; i <v;i++){
                adj[i] = new LinkedList<Integer>();
            }
        }

        public void addEdgeDirected(int source,int destination){
            adj[source].add(destination);
        }


        public boolean DFSRecursive(int source, int destination,boolean vis[]){

            if(source==destination) return true;
            for(int neighbour : adj[source]){
                if(!vis[neighbour]){
                    vis[neighbour]=true;
                    boolean isConnected=DFSRecursive(neighbour,destination, vis);
                    if(isConnected==true) return true;
                }
            }
            return false;
        }
        public boolean DFS_help_Recursive(int source, int destination){
            boolean vis[] = new boolean[adj.length];
            vis[source]=true;
            return DFSRecursive(source,destination,vis);
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int v=scan.nextInt();
            int e=scan.nextInt();
            Q2 gg = new Q2(v);
            for(int j=0;j<e;j++){
                int source=scan.nextInt()-1;
                int destination=scan.nextInt()-1;
                gg.addEdgeDirected(source,destination);
            }
            boolean b=true;
            for(int i=0;i<v;i++){
                b= gg.DFS_help_Recursive(0,i);
                if(b==false){
                    System.out.println(1);
                    break;
                }
            }
            if(b==true){
                System.out.println(0);
            }

        }
    }
}
