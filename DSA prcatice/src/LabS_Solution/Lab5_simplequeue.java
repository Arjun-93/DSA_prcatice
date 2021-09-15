package LabS_Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Lab5_simplequeue{
    static node head = null;
    static node tail = null;
    public static void insert(int val){
        if(head==null){
            head = new node(val);
            tail = head;
            return;
        }
        tail.next = new node(val
        );
        tail = tail.next;

    }
    public static void delete(){
        if(head==null){
            return;
        }
        head = head.next;
    }

    public static void show(){
        if(head==null){
            System.out.println("EMPTY");
        }
        else{
            System.out.println(head.val);
        }
    }
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Reader.init(System.in);
        int q = Reader.nextInt();
        int t;

        while(q-- >0){
            t = Reader.nextInt();
            if(t==1){
                insert(Reader.nextInt());
            }
            else if(t==2){
                delete();
            }
            else{
                show();
            }

        }

    }
}

class node{
    int val;
    node next;
    node(int data){
        this.val = data;
    }
}


class Read {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
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

    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}

