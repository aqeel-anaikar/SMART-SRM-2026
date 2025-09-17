public class queues {
    class node1{
        int data;
        node1 next;

        node1(int data){
            this.data = data;
            this.next = null;
        }
    }
    node1 front = null;
    node1 rear = null;

    public boolean isEmpty(){
        return front== null &&rear == null;
    }
    // Adding in the Queue
    public void Enqueue(int data){
        node1 newnode = new node1(data);
        if (front==null) {
            front = rear = newnode;
            return;
        }
        rear.next = newnode;
        rear = newnode;
    }

    public void Dequque(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        front.data = 0;
        front = front.next;
    }

    public void printQueue(){
        node1 tempfront = front;
        while(tempfront!=null)
        {
            System.out.println(tempfront.data);
            tempfront=tempfront.next;

        }
    }

    public static void main(String[] args) {
        queues myq = new queues();
        myq.Enqueue(10);
        myq.Enqueue(20);
        myq.Enqueue(30);
        myq.Enqueue(40);
        myq.Dequque();
        myq.printQueue();
    }
    
}






















