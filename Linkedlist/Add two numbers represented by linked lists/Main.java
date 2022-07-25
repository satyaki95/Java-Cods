
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
    //Node result;
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
    int SizeOfLinkedList(){
        Node current = head;
        int size =0;
        while(current!=null){
            size++;
            current = current.next;
        }
        return size;
    }
    void AddingZerosAtFirst(){
        Node newNode = new Node(0);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void PrintList(Node result){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    void AddAtFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    int addTwoNodes(Node head1, Node head2){
        if(head1==null){
            return 0;
        }
        int carry = addTwoNodes(head1.next,head2.next);
        int sum =  carry + head1.data + head2.data;
        AddAtFirst(sum%10);
        return sum/10;
    }
    Node AddTwoLinkedList(Node head1, Node head2){
        int carry = addTwoNodes(head1,head2);
        if(carry!=0){
           AddAtFirst(carry);
        }
        return head;
    }
}
public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        for(int i=0;i<n;i++){
            l1.addNode(sc.nextInt());
        }
        for(int i=0;i<m;i++){
            l2.addNode(sc.nextInt());
        }
        int size1 =  l1.SizeOfLinkedList();
        int size2 =  l2.SizeOfLinkedList();
        int zeros = Math.abs((size1 - size2));
        if(size1>size2){
            for(int i=0;i<zeros;i++){
                l2.AddingZerosAtFirst();
            }
        }
        else{
            for(int j=0;j<zeros;j++){
                l1.AddingZerosAtFirst();
            }
        }
        LinkedList l3 = new LinkedList();
        Node head1 = l1.head;
        Node head2 = l2.head;
        Node result = l3.AddTwoLinkedList(head1,head2);
        l3.PrintList(result);
    }
}
