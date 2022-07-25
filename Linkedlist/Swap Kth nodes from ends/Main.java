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

    Node [] findKthNode(int k,Node head){
        int n = SizeOfLinkedList();
        Node [] arr = new Node[4];
        Node front = head;
        Node front_prev = null;
        Node end_prev = null;
        for(int i=1;i<k;i++){
            front_prev = front;
            front = front.next;
        }
        Node end = head;
        for(int i=1;i<n-k+1;i++){
            end_prev = end;
            end = end.next;
        }
        arr[0] = front_prev;
        arr[1] = front;
        arr[2] = end_prev;
        arr[3] = end;
        return arr;
    }
    void SwapNode(int k){
        int n = SizeOfLinkedList();
        Node [] arr = new Node[4];
        arr = findKthNode(k,head);
        Node temp;
        Node front_prev = arr[0];
        Node front = arr[1];
        Node end_prev = arr[2];
        Node end = arr[3];
        if(k==1 || k==n){
            temp = head.next;
            end_prev.next = head;
            end.next = temp;
            head.next = null;
            head =end;
            return;
        }
        if(k>n || k==n-k+1) {
            return;
        }
        temp = front.next;
        front_prev.next = end;
        front.next = end.next;
        end.next = temp;
        end_prev.next = front;
    }

    int SizeOfLinkedList(){
        int size = 0;
        Node current = head;
        while(current!=null){
            current = current.next;
            size++;
        }
        return size;
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
        //your code here
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            l1.addNode(sc.nextInt());
        }
        l1.SwapNode(k);
        l1.PrintList();

    }
}
