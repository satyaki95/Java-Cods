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
    void InsertNode(int data, int pos){
        Node newNode = new Node(data);
        if(pos==0){
            newNode.next = head;
            head = newNode;
            return;
        }
         Node current = head;
        int count = pos;
        while(count>1){
            current = current.next;
            count--;
        }
        Node oldAdd = current.next; 
        // current = head;
        // count = pos;
        // while(count>1){
        //    current = current.next;
        //    count--;
        // }
        current.next = newNode;
        newNode.next = oldAdd;
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
        int inputData = sc.nextInt();
        int pos = sc.nextInt();
        ll.InsertNode(inputData,pos);
        ll.PrintList();
        
    }
}