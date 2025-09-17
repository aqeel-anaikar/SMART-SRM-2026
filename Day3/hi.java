public class hi {        
    private Node  top;
    private int size;        
    hi(){
        this.top=null;
        this.size=0;
    }

    public boolean isempty(){
        return top==null;
    }

    public int size(){
        return size;
    }

    public void push(int data){
        Node newnode=new Node(data);
        newnode.next=top;
        top=newnode;
        size++;
    }

    public void pop(){
        if(isempty()){
            System.out.println("Stack is empty");
        }
        Node temptop=top;
        top=top.next;
        temptop.data=0;
        size--;
    }

    public void printlist(){
        Node temptop = top;
        System.out.print("[ ");
        while(temptop!=null){
            System.out.print(temptop.data+" ");
            temptop=temptop.next;
        }
        System.out.print("]");
    }
    public static void main(String[] args){
        hi stack = new hi();

        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);
        stack.printlist();
    }
}

















