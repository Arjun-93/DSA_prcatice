package DATA_Structures;
public class xy {
    createNode front;
    static class createNode {
        int data;
        createNode link;
        public createNode(int data){
            this.data = data;
            link = null;
        }
    }
    void add_new_node (int data){
        createNode add = new createNode(data);
        if (front == null){
            front = add;
            return ;
        }
        createNode t1 = front;
        while(t1.link !=null){
            t1 = t1.link;
        }
        t1.link  =  add;
    }
    void display(){
        createNode t1 = front;
        while (t1 != null){
            System.out.println(t1.data + "-->");
            t1 = t1.link;
            return ;
        }
    }
    public static void main(String[] args) {
        xy n1 = new xy();
        n1.add_new_node(45);
        n1.add_new_node(54);
        n1.add_new_node(89);
        n1.add_new_node(99);
        System.out.println();
        n1.display();
    }
}
