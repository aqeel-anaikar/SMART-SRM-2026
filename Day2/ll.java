public class ll {
    Node head = null;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }

}
    public void insertAtbeginning(int data) {
        Node newnode=new Node(data);
        newnode.next= head;
        head= newnode;
    }
    public void insertAtEnd(int data){
        Node newnode= new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else{
            Node temphead=head;
            while(temphead.next!=null)
            {
                temphead=temphead.next;
            }
            temphead.next=newnode;
        }
    }

    public void deleteAtBegin()
    {
        Node temp= head;
        temp.data=0;
        head= head.next;
    }
    public void deleteAtEnd()
    {
        Node temp1=null;
        Node temp2=head;
        while(temp2!=null)
        {
            temp1=temp2;
            temp2=temp2.next;
        }
        Node temp1=null;
        Node temp2=head.next;
    }


}