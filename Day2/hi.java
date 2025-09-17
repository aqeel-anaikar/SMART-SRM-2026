public class hi {
    node head = null;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBein(int data) {
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;
    }

    public void insertAtEnd(int data) {
        node newnode = new node(data);
        node temphead = head;
        if (head == null) {
            head = newnode;
        } else {
            while (temphead.next != null) {
                temphead = temphead.next;
            }
            temphead.next = newnode;
        }
    }

    public void deleteAtBegin() {
        node temp = head;
        temp.data = 0;
        head = head.next;
    }

    public void deleteAtEnd() {
        node temp1 = null;
        node temp2 = head;
        while (temp2.next != null) {
            temp1 = temp2;
            temp2 = temp2.next;
        }
        temp1.next = null;
        temp2.data = 0;
    }

    public int SumList(){
        return 0;
    }
    // public node reverse(){
    //     node cur = head;
    //     node prev = null;
    //     while(cur!=null){
    //         node next = cur.next;
    //         cur.next = prev;
    //         prev = cur;
    //         cur = next;
    //     }
    //     return prev;
    // }

    public void printList() {
        node temphead = head;
        while (temphead != null) {
            System.out.println(temphead.data);
            temphead = temphead.next;

        }
    }

    public static void main(String[] args) {
        hi list = new hi();
        list.insertAtBein(10);
        list.insertAtBein(20);
        list.insertAtBein(50);
        list.reverse();
        list.printList();
    }

}
