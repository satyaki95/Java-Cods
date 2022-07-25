import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    Node(int newData){     // constructor
        data = newData;
        next = null;
    }
}
class LinkedList {
    Node head = null;

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
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    void DeleteNode(int position) {
        Node current = head;
        if(position==0){
            head = head.next;
            return;
        }
        int count = position;
        while(count>1){
           current = current.next;
           count--;
        }
        current.next = current.next.next;
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
        int position = sc.nextInt();
        ll.DeleteNode(position);
        ll.PrintList();
    }
}
