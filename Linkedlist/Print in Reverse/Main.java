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
   void printReverse(Node head){
     if(head==null){
       return;
     }
     printReverse(head.next);
     System.out.print(head.data + " ");  // 1 2 3 4 5
   }
}
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList ll = new LinkedList();
        for (int i = 0; i < n; i++) {
            int no = sc.nextInt();
            ll.addNode(no);
        }   
        ll.printReverse(ll.head);
        
    }
}

// import java.util.*;
// import java.io.*;
// class Node{
//     int data;
//     Node next;
//     Node(int newData){
//         data=newData;
//         next=null;
//     }
// }
// class linkedList {
//     Node head;
//     void addAtFirstNode(int data) {
//         Node newNode = new Node(data);
//         if(head==null){
//             head=newNode;
//             return;
//         }
//         Node current=head;
       
//         while(current.next!=null){
//             current=current.next;
//         }
//         current.next=newNode;
//         // newNode.next=head;
//         // head=newNode;
//     }
//     void reverseList(){
//       if(head==null && head.next==null){
//         return;
//       } 
//       Node current,prevNode,nextNode;
//         current=head;
//         prevNode=null;
//         nextNode=null;
//         while(current!=null){
//             nextNode=current.next;
//             current.next=prevNode;
//             prevNode=current;
//             current=nextNode;
//         }
//         head=prevNode;
//     }
//     void printList(){
//         Node current;
//         current=head;
//         while(current!=null){
//             System.out.print(current.data+" ");
//             current=current.next;
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     linkedList ll=new linkedList();
//     for(int i=0;i<n;i++){
//         int number=sc.nextInt();
//         ll.addAtFirstNode(number);
//     }
//     ll.reverseList();
//     ll.printList();
//     }
// }
