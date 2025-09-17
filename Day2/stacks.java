public class stacks {
    class Node1{
        int data ;
        Node1 next;

        Node1(int data){
            this.data = data;
            this.next = null;
        }
    }     
    private Node1 top;
    private int size;
    stacks(){
        this.size = 0;
        this.top = null;
    }
    //Check Stack is Empty or not
    public boolean isEmpty(){
        return top == null;
    }
    //Check the Size of Stack (No of Elements from 0)
    public String size(){
        return "Stack Size is: "+size;
    }
    // Adding values in stack (Nodes)
    public void push(int data){
        Node1 newnode = new Node1(data);

        newnode.next = top;
        top = newnode;
        size++;
    }
    // Removing values from Stack (Nodes)
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty ");
            return;
        }
        Node1 temptop = top;
        top.data = 0;
        top = temptop.next;
        size--;
    }

    public void printStack(){
        Node1 temptop = top;
        while(temptop!=null)
        {
            System.out.println("| "+temptop.data+" |");
            temptop=temptop.next;
        }
        System.out.println(" __ ");
    }

    public static void main(String[] args) {
        stacks mystack = new stacks();
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        mystack.pop();
        mystack.printStack();
        System.out.println(mystack.isEmpty());
        System.out.println(mystack.size());

    }

}
















