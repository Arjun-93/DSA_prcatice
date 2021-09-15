package DATA_Structures;
public class singlylinked_list {
    private Listnode head;
    private int data;
    private Listnode next;

    private static class Listnode {
        private int data;
        private Listnode next;

        public Listnode(int value) {
        }
    }

    private void Listnode(int data) {
        this.data = data;
        this.next = null;
    }
    public void display(){
        Listnode temp = head;
        while (temp != null);{
            System.out.println(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insert_first (int value){
        Listnode newnode = new Listnode(value);
        newnode.next = head;


    }


    public static void main(String[] args) {

    }
}
