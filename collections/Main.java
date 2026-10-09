class Node{
    Node next;
    int value;
    Node(int value,Node next){
        this.value=value;
        this.next=next;
    }
}

class LinkedListDemo{
    Node head;
    LinkedListDemo(){
        head=null;
    }
    public void add(int value){
        Node newnode=new Node(value,null);
        if(this.head==null){
            this.head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        list.add(10);
        System.out.println(list);
    }
}
