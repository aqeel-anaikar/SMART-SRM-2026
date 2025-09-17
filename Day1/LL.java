public class LL {
    node head = null;
    class node {
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insertAtEnd(int data){
        node newnode = new node(data);
        if (head==null) {
            head = newnode;
        }
        else{
            node temphead = head;
            while (temphead.next!=null) {
                temphead = temphead.next;
            }
            temphead.next = newnode;
        }
    }
    // Insert at Begining
    public void insertAtbegning(int data){
        node newnode = new node(data);
        
        newnode.next = head;

        head = newnode;
    } 
    // Delete at Begining
    public void DeleteAtBegining(){
        node temp = head;
        temp.data = 0;
        head = head.next;
    }

    public void DeleteAtEnd(){
        node temp1 = null;
        node temp2 = head;
        while (temp2.next!=null) {
            temp1 = temp2;
            temp2 = temp2.next;
        }
        temp1.next = null;
        temp2.data = 0;
    }

    //Printing a List
    public void printlist(){
        node temphead = head;
        System.out.print("[");
        while (temphead!=null) {
            System.out.print(temphead.data+" ");
            temphead = temphead.next;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtbegning(40);
        list.DeleteAtBegining();
        list.DeleteAtEnd();
        list.printlist();
    }
}


















