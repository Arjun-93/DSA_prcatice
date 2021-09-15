package Revise_DSA.Linkedlist;

public class doublylinkedlist {
    private doublylinkedlist head;
    private doublylinkedlist tail;
    private int height;

    public doublylinkedlist() {
        this.head = null;
        this.tail = null;
        this.height = 0;
    }

    private class Dnode {
        private int data;
        private Dnode next;
        private Dnode prev;

        public Dnode(int data) {
            this.data = data;
        }
    }

    public int isEmpty() {
        return height = 0;
    }
}
