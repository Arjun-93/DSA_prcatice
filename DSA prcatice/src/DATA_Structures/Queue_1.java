package DATA_Structures;

public class Queue_1 {
    int queue[] = new int[6];
    int pointfirst = 0;
    int pointlast = 0;
    int size ;
    public int enqueue(int data){
        queue[pointlast] = data;
        pointlast++;
        size ++;
        return data;
    }
    public void display(){
        for (int n : queue){
            System.out.print(n + " ");

        }
    }
    public int dequeue(){
        int data = queue[pointfirst];
        pointfirst++;
        size--;
        for (int i =0; i<=size;i++){
            System.out.print(queue[pointfirst+i] + " ");
        }
        return data;
    }

    public static void main(String[] args) {
        Queue_1 e1 = new Queue_1();
        e1.enqueue(54);
        e1.enqueue(56);
        e1.enqueue(57);
        e1.enqueue(58);
        e1.display();
        System.out.println();
        e1.dequeue();
//        e1.dequeue();
//        e1.display();
//        e1.display();
    }

}
