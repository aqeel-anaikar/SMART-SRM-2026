public class queue {
    Node front = null;
    Node rear = null;

    public boolean isEmpty() {
        return front == null && rear == null;
    }

    public void enqueue(int data) {
        Node newnode = new Node(data);
        if (front == null) {
            front = rear = newnode;
            return;
        }
        rear.next = newnode;
        rear = newnode;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        front.data = 0;
        front = front.next;
    }

    public void printqueue() {
        Node tempfront = front;
        while (tempfront != null) {
            System.out.println(tempfront.data);
            tempfront = tempfront.next;
        }
    }

    public static void main(String[] args) {
        queue q1 = new queue();
        q1.enqueue(56);
        q1.enqueue(45);
        q1.enqueue(78);
        q1.printqueue();
    }
}
