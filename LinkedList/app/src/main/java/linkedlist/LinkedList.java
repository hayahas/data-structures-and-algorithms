package linkedlist;

public class LinkedList {

Node head;
public LinkedList(){

}
public LinkedList(Node head){
        this.head=head;
    }

    public void insert(int x){
       Node newNode = new Node(x);
       newNode.next=head;
       head=newNode;
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
