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
    void PrintList() {
        Node current;
        current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    void AddAtFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
}
public class Main {
    public static void main(String args[]) {
        //your code here
        	Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList ll = new LinkedList();
        n++;
        while(n>0){
            int a = n%10;
            ll.AddAtFirst(a);
            n= n/10;
        }
        ll.PrintList();
    }
}