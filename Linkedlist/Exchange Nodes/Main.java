
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
  Node tail;
  
void AddNode(int data){
    Node newNode = new Node(data);
    //adding first Node
    if(head==null){
      head = newNode;
      tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;   
    tail.next = head;
  }
  void ExchangeNode(){
    Node current = head;
    while(current.next!=tail){
      current = current.next;
    }
    current.next = head;
    Node temp = head.next;
    tail.next = temp;
    head.next = tail;
    Node dummy = head;
    head = tail;
    tail = dummy;
  }
  
void PrintList(){
    Node current = head;
    while(current.next!=head){
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.print(current.data + " ");
  }
}
public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      LinkedList l1 = new LinkedList();
      for(int i=0;i<n;i++){
        l1.AddNode(sc.nextInt());
      }
      l1.ExchangeNode();
      l1.PrintList();
    }
}