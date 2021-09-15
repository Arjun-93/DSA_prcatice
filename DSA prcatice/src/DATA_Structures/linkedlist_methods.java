package DATA_Structures;

//public class linkedlist_methods {
//    static Nodex head;
//    static Nodex tail;
//    static int size =0;
//
//
//    static void insert(int val){
//        if(head == null){
//            head= new Nodex(val);
//            tail = head;
//            //mid = head;
//            size =1;
//            return;
//
//        }
//        tail = head;
//        while(tail.nxt!=null){
//            tail = tail.nxt;
//        }
//        tail.nxt = new Node(val);
//        size++;
//
//
//    }
//
//    static void delete(int pos){
//        if(pos==1){
//            head = head.nxt;
//            size--;
//            return;
//        }
//        Node temp = head;
//        for(int i=1; i<pos-1; i++){
//            temp = temp.nxt;
//        }
//        temp.nxt = temp.nxt.nxt;
//    }
//
//    static void insert(int pos, int val){
//        if(pos==1){
//            Node temp = new Node(val);
//            temp.nxt = head;
//            head = temp;
//            size++;
//            return;
//        }
//        Node temp = head;
//        for(int i=1; i<pos-1; i++){
//            temp = temp.nxt;
//        }
//        Node temp2 = new Node(val);
//        temp2.nxt = temp.nxt;
//        temp.nxt = temp2;
//    }
//
//
//
//    static void printList(){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data+" ");
//            temp = temp.nxt;
//        }
//        System.out.println();
//    }
