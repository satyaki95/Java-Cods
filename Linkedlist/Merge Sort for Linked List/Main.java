
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    Node(int newData){
        data = newData;
        next = null;
    }
}
class LinkedList{
    Node head;
    void addNode(int data){
        Node newNode = new Node(data);
        //adding the first node
        if(head==null){
            head = newNode;
            return;
        }
        //for adding other nodes
        Node current;
        current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }

    void PrintList( Node newhead){
        Node current = newhead;
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    Node MiddleNode(Node head){
        if(head==null){
            return head;
        }
        Node slow = head;
        Node fast = head;
            while(fast.next!=null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    Node MergeLinkedList(Node h){
        if(h==null || h.next==null){
            return h;
        }
        Node middle = MiddleNode(h);
        Node nextOfMiddle = middle.next;
        middle.next = null;
        Node LeftPart = MergeLinkedList(h);
        Node RightPart= MergeLinkedList(nextOfMiddle);
        Node sortedlist = sortedMerge(LeftPart,RightPart);
        return sortedlist;
    }
    Node sortedMerge(Node a,Node b){
        Node result;
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }
        if(a.data<=b.data){
            result= a;
            result.next = sortedMerge(a.next,b);
        }
        else{
            result = b;
            result.next = sortedMerge(a,b.next);
        }
        return result;
    }
}
public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1 = new LinkedList();
        for(int i=0;i<n;i++){
            l1.addNode(sc.nextInt());
        }
        Node h = l1.head;
        Node newhead = l1.MergeLinkedList(h);
        l1.PrintList(newhead);
    }
}
