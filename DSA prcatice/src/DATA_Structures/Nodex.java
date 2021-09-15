package DATA_Structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//public class Nodex {
//    class Node{
//        int data;
//        DATA_Structures.Node nxt;
//        Node(int dat){
//            this.data = dat;
//            this.nxt = null;
//        }
//    }
//
//
//    class Reader {
//        static BufferedReader reader;
//        static StringTokenizer tokenizer;
//
//        /** call this method to initialize reader for InputStream */
//        static void init(InputStream input) {
//            reader = new BufferedReader(
//                    new InputStreamReader(input) );
//            tokenizer = new StringTokenizer("");
//        }
//
//        /** get next word */
//        static String next() throws IOException {
//            while ( ! tokenizer.hasMoreTokens() ) {
//                //TODO add check for eof if necessary
//                tokenizer = new StringTokenizer(
//                        reader.readLine() );
//            }
//            return tokenizer.nextToken();
//        }
//        static String nextLine() throws IOException {
//            return reader.readLine();
//        }
//
//        static int nextInt() throws IOException {
//            return Integer.parseInt( next() );
//        }
//
//        static double nextDouble() throws IOException {
//            return Double.parseDouble( next() );
//        }
//    }
//
//}
