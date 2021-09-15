package  DATA_Structures;
//// The whole program is create linked list
//public class Node {
//    public int Data;
//    public Node link;
//    public boolean data;
//    Node front;
//
//    Node() { // A simple Node
//        Data = 0;
//        link = null;
//    }
//    Node(int n) { // A Node with a given Value
//        Node n1 = new Node(n);
//        if (front == null){
//            front = n1;
//        }
//        else {
//            Node temp = front;
//            while(temp.link != null){
//                temp = temp.front;
//            }
//            temp.link = n1;
//        }
//        Data = n;
//        link = null;
//    }
//    Node(int n, Node p) { // A Node with given value and refernce
//        Node n1 = new Node(n);
//        Data = n;
//        link = p;
//    }
//    public void Display(){
//        Node cur = front;
//        while(cur!=null){
//            System.out.println(cur.Data + "-->");
//            cur = cur.link;
//        }
//        System.out.println("Null");
//    }
//    public static void main(String[] args) {
//        Node n1 = new Node();
//        n1.Data = 56;
//        Node n2 = new Node();
//        n2.Data = 59;
//        n1.link = n2;
//        n2.link = null;
//        n1.Display();
//    }
//}