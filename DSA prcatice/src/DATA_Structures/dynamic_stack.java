package DATA_Structures;

public class dynamic_stack {
    int capacity = 2;
    int arr[] = new int[capacity];
    int top = 0;
    private void expand(){//expand the size of stack
        int length = size();
        int newarr[] = new int[capacity*2];

        System.arraycopy(arr,0,newarr,0,length);//instead of this we can use for loop for copying the array
        arr = newarr;
        capacity *=2;
    }

    public void push(int data){//push elements into the stack
        if (top == 4){
            System.out.println("Stack is full");
        } else{
            if (size() == capacity){
                expand();
            }
            arr[top] = data;
            top++;
        }
    }

    private void shrink(){// shrink the size of stack
        int length = size();
        if (length <= (capacity/2)/2){
            capacity = capacity/2;
            int newarr[] = new int[capacity];
            System.arraycopy(arr,0,newarr,0,length);
            arr = newarr;
        }
    }

    public int pop () {//pop element from stack
        int data = 0;
        if (isempty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
            data = arr[top];
            arr[top] = 0;
            shrink();
        }
        return data;
    }

    public void display(){//display elements of stack
        for (int n :arr){
            System.out.print(n + " ");
        }
    }

    public int peek(){//get elements of stack
        int data ;
        data = arr[top-1];
        return data;
    }

    public int size(){//get size of stack
        return top;
    }

    public boolean isempty(){//check stack is empty
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
