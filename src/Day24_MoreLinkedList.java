import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }

}
class Day24_MoreLinkedList
{
    public static Node removeDuplicates(Node head) {
        while(head.next != null) { //if it's the last node
            if(head.data == head.next.data){ //if the current and next node have the same data
                head.next = head.next.next; //get rid of next node
                removeDuplicates(head); //re-test current node with the new next node
            }else{
                removeDuplicates(head.next);
            }
            return head;
        }
        return head;
    }

    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}
