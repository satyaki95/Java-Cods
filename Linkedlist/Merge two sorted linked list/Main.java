
import java.util.*;
import java.io.*;
class Node {
    int data;
    Node next;
    Node(int newData){
        data = newData;
        next = null;
    }
}
class LinkedList {
    Node head;

    void addNode(int data) {
        Node newNode = new Node(data);

        //if adding the firstNode
        if (head == null) {
            head = newNode;
            return;
        }
        Node current;
        current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void PrintList() {
        Node current;
        current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    void MergeList(Node head1,Node head2){
      Node newNode =null;
      while(head1!=null && head2!=null){
        if(head1.data<=head2.data){
           if(head==null){
             head = new Node(head1.data);
             newNode  = head;
           }
           else{
             newNode.next = new Node(head1.data);
             newNode = newNode.next;        
           }
          head1 = head1.next;
          
        }
        else{
           if(head==null){
             head = new Node(head2.data);
             newNode  = head;
             
           }
           else{
             newNode.next = new Node(head2.data);
             newNode = newNode.next;
           }
          head2 = head2.next;
        }
      }
        while(head1!=null) {
            if(head == null) {
                head = new Node(head1.data);
                newNode = head;
            }
            else {
                newNode.next = new Node(head1.data);
                newNode = newNode.next;
            }
            head1 = head1.next;
        }
        while(head2!=null) {
            if (head == null) {
                head = new Node(head2.data);
                newNode = head;
            }
            else {
                newNode.next = new Node(head2.data);
                newNode = newNode.next;
            }
            head2 = head2.next;
        }

    }
}
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1 = new LinkedList();    
        for (int i = 0; i < n; i++) {
            l1.addNode(sc.nextInt());
        }  
        int m = sc.nextInt();
        LinkedList l2 = new LinkedList();
        for (int i = 0; i < m; i++) {
            l2.addNode(sc.nextInt());
        }
        LinkedList l3 = new LinkedList();
        l3.MergeList(l1.head,l2.head);
        l3.PrintList();
    }
}