package Revise_DSA.Trees;

public class findingNode {
    private Nodex root;

    public Nodex find(int key){
        Nodex curr= root;
        while (curr.data != key){
            if (key <curr.data){
                curr = curr.leftchild;
            } else{ curr =  curr.rightchild; }
            if (curr == null)
                return null;
        }
        return curr;
    }

    public void insert(int x, int y){

    }

    public Nodex find_minimum(){
        Nodex curr , last = null;
        curr = root;
        while (curr !=null){
            last = curr;
            curr =  curr.leftchild;
        }
        return last;
    }
    public Nodex find_maximum(){
        Nodex curr , last = null;
        curr = root;
        while (curr !=null){
            last = curr;
            curr =  curr.rightchild;
        }
        return last;
    }
}







class Nodex{
    double data;
    Nodex leftchild;
    Nodex rightchild;

    public void displayNode(){
    }
}

