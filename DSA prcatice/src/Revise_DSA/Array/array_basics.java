package Revise_DSA.Array;

public class array_basics {
    public static int insert(int []arr,  int  key){
        int n =  arr.length;
        arr[n] = key;
        n++;
        return 0;
    }
    public boolean delet(int []a,  int  key){
        int nElems =  a.length;
        int j;
        for(j=0; j<nElems; j++) // look for it
            if( key == a[j] )
                break;
        if(j==nElems) // can’t find it
            return false;
        else // found it
        {
            for(int k=j; k<nElems; k++) // move higher ones down
                a[k] = a[k+1];
            nElems--; // decrement size
            return true;
        }
    } // end delete()
    public void display(int []a) // displays array contents
    {
        int nElems = a.length;
        for(int j=0; j<nElems; j++) // for each element,
            System.out.print(a[j] + " "); // display it
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr[] = new int[100];

    }
}
