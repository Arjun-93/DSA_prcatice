package LabS_Solution;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Set_interface {

    public static void main(String[] args) throws IOException {
        Scanner sc  =  new Scanner(System.in);
        Reader.init(System.in);
        int n = Reader.nextInt();
        int post[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your Query : ");
            String s = Reader.nextLine();
            int x = sc.nextInt();
            Set<Integer> Query = new TreeSet<>();
            if (s == "INSERT") {
                Query.add(x);
            }
            if (s == "DELETE"){
                Query.remove(x);
            }
            if (Query == null){
                System.out.println("EMPTY");
            }
            if (s == "MIN"){
                Optional<Integer> min;
//                min = Query.stream().min();
            }
            if ( s == "MAX"){

            }
        }
    }
}


class Reader {
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

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}
