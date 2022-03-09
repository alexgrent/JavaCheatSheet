package collections;


public class Stack {
    public int stck[] = new int[10];
    private int tos = -1;

    public void push(int item){
        stck[++tos] = item;
    }

    public int pop(){
        if(tos<0){
            System.out.printf("underflow");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }

}
