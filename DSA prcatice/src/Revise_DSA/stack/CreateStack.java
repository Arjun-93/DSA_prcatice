package Revise_DSA.stack;

import java.util.EmptyStackException;

public class CreateStack {
    private stackNode top;
    private int length;

    public CreateStack(){
        top  = null;
        length = 0;
    }

    private class stackNode{
        private int data;
        private stackNode next;

        public stackNode(int data){
            this.data = data;
        }
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length ==0;
    }
    public void push(int data){
        stackNode temp = new stackNode(data);
        temp.next = top;
        top = temp;
        length++;
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            int ptr = top.data;
            top = top.next;
            length--;
            return ptr;
        }
    }
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            return top.data;
        }
    }
     public void main(String[] args) {
        CreateStack s1 = new CreateStack();
        push(56);
         System.out.println();
        push(85);
        push(46);
        pop();
         System.out.println(peek());



    }
}
