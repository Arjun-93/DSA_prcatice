package DATA_Structures;
//Stack implementation from array
public class stcak {
    int arr[] = new int[5];
    int top = 0;
    public void push(int data){
        if (top == 4){
            System.out.println("Stack is full");
        } else{
            arr[top] = data;
            top++;
        }
    }
    public int pop () {
        if (isempty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
            int data;
            data = arr[top];
            return data;
        }
        return 0;
    }
    public void display(){
        for (int n :arr){
            System.out.print(n + " ");
        }
    }
    public int peek(){
        int data ;
        data = arr[top-1];
        return data;
    }
    public int size(){
        return top;
    }
    public boolean isempty(){
        return top <=0;
    }
    public static void main(String[] args) {
        stcak s = new stcak();
        s.push(54);
        s.push(56);
        s.display();
        System.out.println();
        System.out.println(s.size());
        System.out.println(s.peek());
//        System.out.println(s.pop());
    }
}
