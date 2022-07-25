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
    Node newhead;

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
    Node MergeList(Node a, Node b){
        Node result;
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }
        if(a.data<=b.data){
            result =a;
            result.next = MergeList(a.next,b);
        }
        else{
            result = b;
            result.next = MergeList(a,b.next);
        }
        return result;
    }

    void PrintList() {
        Node current;
        current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList listl1 = new LinkedList();
        for(int i=0;i<n;i++) {
            int no1 = sc.nextInt();
            listl1.addNode(no1);
        }
        int m = sc.nextInt();
        LinkedList listl2 = new LinkedList();
        for(int j=0;j<m;j++){
            int no2 = sc.nextInt();
            listl2.addNode(no2);
        }
        LinkedList listl3 = new LinkedList();
        listl1.head = listl3.MergeList(listl1.head,listl2.head);
        listl1.PrintList();
    }
}