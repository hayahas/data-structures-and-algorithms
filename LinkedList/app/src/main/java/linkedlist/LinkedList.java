package linkedlist;

public class LinkedList {

public Node head = null;
public Node tail= null;
public LinkedList(){

}
public LinkedList(Node head){
    this.head=head;
    this.tail=tail;
}

    public void insert(int x){
       Node newNode = new Node(x);
       newNode.next=head;
       head=newNode;
    }

    public void insertToTail(int x){
        Node newNode = new Node(x);
        newNode.next=null;
        if(head==null){
            head= newNode;
        }else {
            Node temp=new Node();
            temp=head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }


    public void insertBefore(int x,int y){
        Node newNode = new Node(y);
        Node bfrNode =null;
        newNode.next=null;
        if(head==null){
            head= newNode;
        }else {
            Node temp=new Node();
            temp=head;
            while(temp.value != x){
                bfrNode=temp;
                temp=temp.next;
            }
    newNode.next=bfrNode.next;
         bfrNode.next=newNode;
        }

    }

    public void insertAfter(int x,int y){

        Node newNode = new Node(y);
        newNode.next=null;
        if(head==null){
            head= newNode;
        }else {
            Node temp=new Node();
            temp=head;
            while(temp.value != x){
                temp=temp.next;
            }
            newNode.next= temp.next;
            temp.next=newNode;

        }
    }


    public boolean includes(int x){
        Node newNode= head;
        while(newNode != null){
            if(newNode.value == x)
                return true;
            newNode=newNode.next;
        }
        return false;
    }

    @Override
    public String toString() {
        String values = "";
        Node newNode= head;
        while(newNode != null){
            values+="{" + newNode.value + "}" + "->";
            newNode=newNode.next;
        }
        values+="Null";
        return values;
    }


    public void delete(){
        head=head.next;
    }


}
